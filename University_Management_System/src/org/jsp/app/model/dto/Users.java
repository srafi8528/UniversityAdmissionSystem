package org.jsp.app.model.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users 
{
	@Id
	private String loginId;
	private String password;
	private String role;
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}