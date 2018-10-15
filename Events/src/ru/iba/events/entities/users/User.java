package ru.iba.events.entities.users;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		Pattern p = Pattern.compile("^\\w+$");  
        Matcher m = p.matcher(Login);  
		if(!m.matches() || Login=="")
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
		Pattern p = Pattern.compile("^[Р-пр-џ]+|[A-Za-z]+$");  
        Matcher m = p.matcher(Firstname);  
		if(!m.matches() || Firstname=="")
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
		Pattern p = Pattern.compile("^[Р-пр-џ]+|[A-Za-z]+$");  
        Matcher m = p.matcher(Lastname);  
		if(!m.matches() || Lastname=="")
		{
			return false;//will add a "throw new exc"
		}
		lastname=Lastname;
		return true;
		
	}
	public boolean setEmail(String Email)
	{
		if(Email==null)
		{
			return false;
		}
		Pattern p = Pattern.compile("^(\\w+|\\w+[.-]\\w+)@([a-zA-Z]{2,}|[р-џР-п]{2,})\\.([a-zA-Z]{2,}|[р-џР-п]{2,})$");  
        Matcher m = p.matcher(Email);  
		if(!m.matches() || Email.equals(""))
		{
			return false;
		}
		email=Email;
		return true;
	}
	public boolean setPhoneNumber(String PhoneNumber) {
		if(PhoneNumber==null)
		{
			return false;//will add a "throw new exc"
		}
		Pattern p = Pattern.compile("^(\\+?375|80)(29|25|44|33|17)\\d{7}$");  
        Matcher m = p.matcher(PhoneNumber);  
		if(!m.matches() || PhoneNumber=="")
		{
			return false;//will add a "throw new exc"
		}
		phoneNumber=PhoneNumber;
		return true;
	}
	
}
