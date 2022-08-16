package com.SpringBootLearning;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBootLearning.DAO.ConnectionDAO;
import com.SpringBootLearning.VO.UserVO;

@SpringBootApplication
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootLearningApplication.class, args);
		ConnectionDAO dao=context.getBean(ConnectionDAO.class);
		
		String email="ram.chaudhary@gmail.com";
		String[] split = email.split("@");
		System.out.println(split);
		System.out.println(split[0]);
		System.out.println(split[1]);
		
	/*	UserVO vo=new UserVO();
		vo.setName("RAM CHAUDHARY-");
		vo.setCity("DELHI");
		vo.setDate(new Date());
		
		UserVO user=dao.save(vo);
		System.out.println(user);
		System.out.println("data saved");
		
		//#####################################
		UserVO vo2=new UserVO();
		vo2.setName("Aman SIngh");
		vo2.setCity("DELHI");
		vo2.setDate(new Date());
		
		UserVO vo3=new UserVO();
		vo3.setName("Adityta");
		vo3.setCity("DELHI");
		vo3.setDate(new Date());
		ArrayList<UserVO> userList=new ArrayList();
		userList.add(vo2);
		userList.add(vo3);
		Iterable<UserVO> resultUser=dao.saveAll(userList);
		resultUser.forEach(users->{
			System.out.println(users);
		});
		System.out.println("data saved");
		
		
		Optional<UserVO> userDtl=dao.findById(9);
		UserVO userData=userDtl.get();
		System.out.println(userData.getName());
		userData.setName("Aditya kumar");
		UserVO saveUserData=dao.save(userData);
		System.out.println("update data===="+saveUserData);
		 * */
		
		System.out.println("all user data");
		Iterable<UserVO> itrdata=dao.findAll();
		for(UserVO userData1:itrdata)
		{
			System.out.println("Name==="+userData1.getName()+": city="+userData1.getCity()+": ID==="+userData1.getId()+"\n");
		}
		
		//dao.deleteById(18);
		
		//List<UserVO> userNameDtl=dao.findByName("Adityta");
		//List<UserVO> userNameDtl=dao.findByNameLike("%RAM CHAUDHARY%");
		List<UserVO> userNameDtl=dao.findByNameAndCity("RAM CHAUDHARY-", "NOIDA");
		System.out.println("##########Custome method#############"+userNameDtl.size());
		for(UserVO userNameDtlData: userNameDtl)
		{
			System.out.println("data----"+userNameDtlData);
		}
		
		
		System.out.println("############### manual query fire.. ###################");
		List<UserVO> getAllUser = dao.getAllUser();
		getAllUser.forEach(e->{
			System.out.println("manual quey fire data---"+e);
		});
		
		System.out.println("######### manual query fire with conditional.. #########");
		List<UserVO> allUserByName = dao.getAllUserByName("Adityta");
		allUserByName.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("############# fire MYSQL native query.. ##########");
		List<UserVO> allUserWithSQL = dao.getAllUserWithSQL();
		allUserWithSQL.forEach(e->{
			System.out.println(e);
			
		});
	}

}
