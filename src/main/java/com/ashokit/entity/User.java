package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS_DETAILS")
public class User {
	
	@Id
	@Column(name="USER_ID")
	private Integer Userid;
	@Column(name="USER_NAME")
	private String Username;
	@Column(name="USER_PHNO")
	private Long Userphno;
	@Column(name="USER_AGE")
	private Integer Userage;
	@Column(name="USER_COUNTRY")
	private String Usercountry;
	
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer Userid) {
		this.Userid=Userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username=Username;
	}
	public Long getUserphno() {
		return Userphno;
	}
	public void setUserphno(Long Userphno) {
		this.Userphno=Userphno;
	}
	public Integer getUserage() {
		return Userage;
	}
	public void  setUserage(Integer Userage) {
		this.Userage=Userage;
	}
	public String getUsercountry() {
		return Usercountry;
	}
	public void setUsercountry(String Usercountry) {
		this.Usercountry=Usercountry;
	}
	@Override
	public String toString() {
		return "User[Userid="+ Userid +"Username="+ Username +"Userphno="+ Userphno +
				"Userage="+Userage+"Usercountry="+Usercountry +"]";
				}

}
