package ru.iba.events.entities;

public class MembersPerformer {
	
	private String name;
	private String age;
	private String position;
	private String additional;
	
	public String getName()
	{
		return name;
	}
	public String getAge()
	{
		return age;
	}
	public String getPosition()
	{
		return position;
	}
	public String getAdditional()
	{
		return additional;
	}
	
	public boolean setName(String Name) {

		if(Name==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Name=="")
		{
			return false;//will add a "throw new exc"
		}
		name=Name;
		return true;
		
	}
	public boolean setAge(String Age)
	{
		
		if(Age==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Age=="")
		{
			return false;//will add a "throw new exc"
		}
		age=Age;
		return true;
		
	}
	public boolean setPosition(String Position)
	{

		if(Position==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Position=="")
		{
			return false;//will add a "throw new exc"
		}
		position=Position;
		return true;
	}
	public boolean setAdditional(String Additional)
	{
		additional=Additional;
		return true;
	}
	
}
