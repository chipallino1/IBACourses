package ru.iba.events.entities;

public class Festival extends Event {

	protected int enterancePrice;
	
	public int getEnterancePrice()
	{
		return enterancePrice;
	}
	public boolean setEnterancePrice(int enterancePriceSetting)
	{
		if(enterancePriceSetting>=0)
			return true;
		return false;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return Date;
	}

	@Override
	public boolean setID(int idSetting) {

		if(idSetting>0)
		{
			ID=idSetting;
			return true;
		}
		return false;
	}

	@Override
	public boolean setName(String nameSetting) {
		if(nameSetting!=null && !nameSetting.isEmpty())
			{
				Name=nameSetting;
				return true;			
			}
		return false;
	}

	@Override
	public boolean setDate(String dateSetting) {
		if(dateSetting!=null && !dateSetting.isEmpty())
		{
			Date=dateSetting;
			return true;
		}
		return false;
	}

	
	
}
