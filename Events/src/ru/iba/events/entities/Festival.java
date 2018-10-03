package ru.iba.events.entities;

public class Festival extends Event {

	@Override
	public boolean addPurchasedPlaces(int addingPurchasedPlaces) {
		
		if(addingPurchasedPlaces>0)
		{
			purchasedPlaces=purchasedPlaces+addingPurchasedPlaces;
			
			return true;
		}
		return false;
		
	}

	
	
}
