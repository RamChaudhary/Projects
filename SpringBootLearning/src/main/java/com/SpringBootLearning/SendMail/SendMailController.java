package com.SpringBootLearning.SendMail;

import java.sql.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;


@RestController
@CrossOrigin
@RequestMapping("/SendMailController")
public class SendMailController {

	@GetMapping("/test")
	public String test()
	{
		return "test mail controller";
	}
	
	@PostMapping("/sentMail")
	public ResponseEntity<?> sendMail(@RequestBody MailSentRequest request) throws Exception
	{
		boolean status=false;
		System.out.println(request);
		String to=request.getTo();
		String subject=request.getSubject();
		String mailMessage=request.getMessage();
		String host="smtp.gmail.com";
		String from ="praveshc80@gmail.com";
		
		Properties properties=System.getProperties();
		System.out.println("propery="+properties);
		
		try {
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "587");
			properties.put("mail.smtp.ssl.enable", "true");
			
			
			 Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			      protected PasswordAuthentication getPasswordAuthentication() {
			         return new PasswordAuthentication("praveshc80@gmail.com", "praveshpc");
			      }
			   });
			   Message msg = new MimeMessage(session);
			   msg.setFrom(new InternetAddress(to, false));

			   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			   msg.setSubject(subject);
			 //  msg.setContent(mailMessage, "text/html");
			   msg.setSentDate(new java.util.Date());

			   MimeBodyPart messageBodyPart = new MimeBodyPart();
			   messageBodyPart.setContent(mailMessage, "text/html");

			   Multipart multipart = new MimeMultipart();
			   multipart.addBodyPart(messageBodyPart);
			   MimeBodyPart attachPart = new MimeBodyPart();

			  // attachPart.attachFile("Desktop\\calculation.xlsx");
			//   multipart.addBodyPart(attachPart);
			   msg.setContent(multipart);
			   Transport.send(msg);   
			   status=true;
			   if(status)
			   {
					return ResponseEntity.ok("Mail sent sucessfully");

			   }
			   else
			   {
				   return ResponseEntity.ok("Mail Not sent");
			   }
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();

			 return ResponseEntity.ok("thowing Exception...");
		}
		   
	}

}
