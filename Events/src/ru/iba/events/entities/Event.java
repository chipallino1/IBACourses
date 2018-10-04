package ru.iba.events.entities;

public abstract class Event {
	int id;
	int enterancePrice;
	String name;
	String date;
	int purchasedPlaces;			//  общее кол-во купленных мест
	
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

	
	
}
