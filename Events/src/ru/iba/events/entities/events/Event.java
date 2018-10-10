package ru.iba.events.entities.events;

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
		if(dateSetting!=null && !dateSetting.isEmpty())
		{
			date=dateSetting;
			return true;
		}
		
		return false;
	}
	public boolean setTime(String Time)
	{
		if(Time!=null && !Time.isEmpty())
		{
			date=Time;
			return true;
		}
		return false;
	}

	
	
}
