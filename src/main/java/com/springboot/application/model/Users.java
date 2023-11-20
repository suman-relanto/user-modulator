package com.springboot.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uId;

	@Column(name = "user_first_name", nullable = false)
	private String userFirstName;

	@Column(name = "user_last_name", nullable = false)
	private String userLastName;

	@Column(name = "user_emailId", nullable = false)
	private String emailId;

	@Column(name = "user_mobileNumber", nullable = false)
	private String mobileNumber;

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Users(long uId, String userFirstName, String userLastName, String emailId, String mobileNumber) {
		super();
		this.uId = uId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [uId=" + uId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}

}
