package ru.iba.events.entities;

//класс исполнителей, исполнителем моет являтся какая-нибудь фирма на фестивале,
//например какое-нибудьь кафе
public class Performers {
	
	private int id;
	private String name;	
	private MembersPerformer[] members;//участники фирмы на фестивале/участники группы на концерте
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public MembersPerformer[] getMembers()
	{
		return members;
	}
	
	public boolean setId(int id)
	{
		if(id<0)
			return false;
		return true;
	}
	public boolean setName(String Name)
	{
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
	public boolean setMembers(MembersPerformer[] Members)
	{
		if(Members==null)
		{
			return false;//will add a "throw new exc"
		}
		if(Members.length==0)
		{
			return false;//will add a "throw new exc"
		}
		members=Members;
		return true;
	}

}
