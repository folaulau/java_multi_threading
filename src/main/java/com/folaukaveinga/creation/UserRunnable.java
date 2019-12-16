package com.folaukaveinga.creation;

public class UserRunnable implements Runnable {

	private String firstName;
	private String lastName;
	private String email;

	public UserRunnable() {
		super();
		System.out.println("UserRunnable");
	}

	@Override
	public void run() {
		System.out.println("running UserRunnable..");
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

}
