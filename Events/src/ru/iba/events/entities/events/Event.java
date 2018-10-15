package ru.iba.events.entities.events;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ru.iba.events.entities.exceptions.CustomException;

public abstract class Event {
	protected int id;
	protected int enterancePrice;
	protected String name;
	protected String date;
	protected String time;
	protected int purchasedPlaces;			//  общее кол-во купленных мест
	
	public abstract boolean addPurchasedPlaces(int addingPurchasedPlaces) throws CustomException;
	
	
	public int getEnterancePrice()
	{
		return enterancePrice;
	}
	
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getDate() {
		// TODO Auto-generated method stub
		return date;
	}
	public String getTime() {
		return time;
	}
	public boolean setEnterancePrice(int enterancePriceSetting)
	{
		if(enterancePriceSetting>=0)
			return true;
		return false;
	}

	public boolean setID(int idSetting) {

		if(idSetting>0)
		{
			id=idSetting;
			return true;
		}
		return false;
	}

	public boolean setName(String nameSetting) {
		if(nameSetting!=null && !nameSetting.isEmpty())
			{
				name=nameSetting;
				return true;			
			}
		
		return false;
	}

	public boolean setDate(String dateSetting) {
		if(dateSetting==null)
			return false;
		Pattern p = Pattern.compile("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)");  
        Matcher m = p.matcher(dateSetting);  
		if(m.matches() && !dateSetting.isEmpty())
		{
			date=dateSetting;
			return true;
		}
		
		return false;
	}
	public boolean setTime(String Time)
	{
		//^([01]?[0-9]|2[0-3])(:|\-)([0-5][0-9])$
		Pattern p = Pattern.compile("^([01]?[0-9]|2[0-3])(:|\\-)([0-5][0-9])$");  
        Matcher m = p.matcher(Time);  
		if(Time==null)
			return false;
		if(m.matches() && !Time.isEmpty())
		{
			time=Time;
			return true;
		}
		return false;
	}

	
	
}
