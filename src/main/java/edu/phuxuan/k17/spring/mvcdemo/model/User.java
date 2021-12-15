package edu.phuxuan.k17.spring.mvcdemo.model;

public class User {
	public User(String fullName) {
		super();
		this.fullName = fullName;
	}
	
	public User() {
		
	}
	
	private String fullName;
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}
