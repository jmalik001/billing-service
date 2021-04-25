package com.dj.billingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "users")
@Setter
@Getter
public class User {
	
	@Id
	@Column(name= "user_id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name= "user_name")
	private String userName;
	
	@NotNull
	private String password;
	@NotNull
	private String fullName;
	
	@Column(name= "country_code")
	private String countryCode;
	
	private Long phone;
	@NotNull
	@Column(name= "enabled")
	private boolean isEnabled;



	public User(String userName, String password, String fullName, String countryCode, Long phone, boolean enabled) {
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.countryCode = countryCode;
		this.phone = phone;
		this.isEnabled = enabled;
	}



	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", fullName=" + fullName
				+ ", countryCode=" + countryCode + ", phone=" + phone + ", isEnabled=" + isEnabled + "]";
	}
	

	
}
