package com.SpringBootLearning.serverSideValidation;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class UserForm {
	private String userName;
	private String userEmail;
	private String password;
	private String checkMe;
	
	@NotBlank(message = "user name can not be blank")
	@NotNull(message = "user name can not be null")
	@Size(min = 5,max = 100,message = "name length should be between 5 and 100")
	 private String name;
	@NotBlank(message = "user email can not be blank")
	@NotNull(message = "user email can not be null")
	@javax.validation.constraints.Email
	    private String email;
	@NotBlank(message = "user gender can not be blank")
	@NotNull(message = "user gender can not be null")
	    private String gender;
	@NotBlank(message = "user profession can not be blank")
	@NotNull(message = "user profession can not be null")
	    private String profession;
	@NotBlank(message = "user note can not be blank")
	@NotNull(message = "user note can not be null")
	    private String note;
	@NotBlank(message = "user birthday can not be blank")
	@NotNull(message = "user birthday can not be null")
	    private String birthday;
	    private boolean married;
	
	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public boolean isMarried() {
			return married;
		}
		public void setMarried(boolean married) {
			this.married = married;
		}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCheckMe() {
		return checkMe;
	}
	public void setCheckMe(String checkMe) {
		this.checkMe = checkMe;
	}
	public UserForm(
			@NotBlank(message = "user name can not be blank") @NotNull(message = "user name can not be null") String userName,
			String userEmail, String password, String checkMe, String name, String email, String gender,
			String profession, String note, String birthday, boolean married) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
		this.checkMe = checkMe;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.profession = profession;
		this.note = note;
		this.birthday = birthday;
		this.married = married;
	}
	public UserForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserForm [userName=" + userName + ", userEmail=" + userEmail + ", password=" + password + ", checkMe="
				+ checkMe + ", name=" + name + ", email=" + email + ", gender=" + gender + ", profession=" + profession
				+ ", note=" + note + ", birthday=" + birthday + ", married=" + married + "]";
	}
	
	
	

}
