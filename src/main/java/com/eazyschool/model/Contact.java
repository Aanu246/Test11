package com.eazyschool.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="contact_msg")
public class Contact extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy="native")
	@Column(name="contact_id")
	private int ContactId;
	
	@NotBlank(message="Name must not be blank")
	@Size(min=3,message="Name must be at least 3 characters long")
	private String name;
	
	@NotBlank(message="Name must not be blank")
	@Pattern(regexp="(^$|[0-9]{11})",message="mobile number must be 11 digits")
	private String mobileNum;
	
	@NotBlank(message="Name must not be blank")
	@Email(message="please provide a valid email address")
	private String email;
	
	@NotBlank(message="Name must not be blank")
	@Size(min=5,message="subject must be at least 5 characters long")
	private String subject;
	
	@NotBlank(message="Name must not be blank")
	@Size(min=10, message="message must be at least 10 characters long")
	private String message;
	
	private String status;
	
	//public String getName() {
	//	return name;
	//}
	//public void setName(String name) {
		//this.name = name;
	//}
	//public String getMobileNum() {
		//return mobileNum;
	//}
	//public void setMobileNum(String mobileNum) {
	//	this.mobileNum = mobileNum;
	//}
	//public String getEmail() {
		//return email;
	//}
	//public void setEmail(String email) {
		//this.email = email;
	//}
	//public String getSubject() {
		//return subject;
	//}
	//public void setSubject(String subject) {
		//this.subject = subject;
	//}
	//public String getMessage() {
	//	return message;
	//}
	//public void setMessage(String message) {
	//	this.message = message;
	//}
	
	//@Override
	//public String toString() {
	//	return "Contact [name=" + name + ", mobileNum=" + mobileNum + ","
		//		+ " email=" + email + ", subject=" + subject
		//		+ ", message=" + message + "]";
	//}
	
	
	
	
	

}
