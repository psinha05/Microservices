
package com.tma.authentication;

public class UserAuthentication {
	
	private int id;	
	private String firstName;	
	private String lastName;	
	private String email;	
	private int port;
	
	public UserAuthentication() {
		
	}
	
	public UserAuthentication(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

	/*
	 * private int id; private String name; //private int port;
	 * 
	 * public UserAuthentication() {
	 * 
	 * }
	 * 
	 * public UserAuthentication(int id, String name) { super(); this.id = id;
	 * this.name = name; }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * public int getPort() { return port; }
	 * 
	 * public void setPort(int port) { this.port = port; }
	 * 
	 * 
	 * @Override public String toString() { return "UserAuthentication [id=" + id +
	 * ", name=" + name + "]";
	 * 
	 * }
	 */

}
