package ru.iba.events.entities;

public abstract class User {

	int id;
	String login;
	String firstname;
	String lastname;
	String email;
	String phone;
	
	public abstract Performers[] getPerformers();
	
	
}
