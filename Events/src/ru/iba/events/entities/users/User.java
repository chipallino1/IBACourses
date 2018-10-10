package ru.iba.events.entities.users;

public abstract class User {

	protected int id;
	protected String login;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String phoneNumber;
	
	public String getLogin() {
		
		return login;
		
	}
	public String getFirstname() {
		
		return firstname;
		
	}
	public String getLastname() {
		
		return lastname;
		
	}
	public String getEmail()
	{
		return email;
	}
	public String getPhone()
	{
		return phoneNumber;
	}
	
	public boolean setLogin(String Login) {
		
		if(Login==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Login=="")
		{
			return false;//will add a "throw new exc"
		}
		login=Login;
		return true;
		
	}
	public boolean setFirstname(String Firstname) {
		
		if(Firstname==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Firstname=="")
		{
			return false;//will add a "throw new exc"
		}
		firstname=Firstname;
		return true;
		
	}
	public boolean setLastname(String Lastname) {
		
		if(Lastname==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Lastname=="")
		{
			return false;//will add a "throw new exc"
		}
		lastname=Lastname;
		return true;
		
	}
	public boolean setEmail(String email)
	{
		if(email==null || email.equals(""))
			return false;
		
		
		boolean result = email.matches("\\w+@\\w+");
		System.out.println(result);
		return true;
	}
	public boolean setPhoneNumber(String PhoneNumber) {
		if(PhoneNumber==null)
		{
			return false;//will add a "throw new exc"
		}
		if(PhoneNumber=="")
		{
			return false;//will add a "throw new exc"
		}
		phoneNumber=PhoneNumber;
		return true;
	}
	
}
