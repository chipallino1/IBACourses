package ru.iba.events.entities;

public class Concert extends Event{

	int capacity;					//	вместимость	(вместимость не на тацполе = вместимость-вместиомсть на тнацоле)
	int freePlaces;					//  общее кол-во свободных мест
	boolean hasDancefloor;    		//  есть ли танцпол
	int capacityDancefloor;			//  кол-во мест на танцполе 
	int freePlacesDancefloor;		//  кол-во свободных мест на танцполе
	int purchasedPlacesDancefloor;	//  кол-во купленных мест на танцполе
	
	public int getCapacity() {
		
		return capacity;
		
	}	
	
	public int getFreePlaces() {
		
		return freePlaces;
		
	}
	
	public int getPurchasedPlaces()
	{
		return purchasedPlaces;
	}
	
	public boolean getHasDancefloor() {
		
		return hasDancefloor;
	}
	
	public int getCapacityDancefloor() {
		
		return capacityDancefloor;
		
	}
	
	public int getFreePlacesDancefloor() {
		
		return freePlacesDancefloor;
		
	}
	
	public int getPurchasedPlacesDancefloor() {
		
		return purchasedPlacesDancefloor;
	}
	
	public boolean setCapacity(int settingCapacity) {
		
		if(settingCapacity>0)
		{
			capacity=settingCapacity;
			return true;
		}
		return false;
		
	}
	
	//добавление свободных мест не на танцпол
	public boolean addFreePlaces(int addingFreePlaces,boolean returning) { 
		
		if(addingFreePlaces>0)
		{
			
			freePlaces=freePlaces+addingFreePlaces;
			capacity=capacity+addingFreePlaces;
			
			if(returning)
			{
				purchasedPlaces=purchasedPlaces-addingFreePlaces;
			}
			
			return true;
		}
		return false;
		
	}
	
	//добавление купленных билетов не на танцполе
	@Override
	public boolean addPurchasedPlaces(int addingPurchasedPlaces)
	{
		if(addingPurchasedPlaces>0 && (capacity-capacityDancefloor-addingPurchasedPlaces)>0)
		{
			purchasedPlaces=purchasedPlaces+addingPurchasedPlaces;
			freePlaces=freePlaces-addingPurchasedPlaces;
			capacity=capacity-addingPurchasedPlaces;
			
			return true;
		}
		return false;
	}
	
	public boolean setHasDancefloor(boolean settingHasDancefloor) {
		
		hasDancefloor=settingHasDancefloor;
		return true;
	}
	
	public boolean setCapacityDancefloor(int settingCapacityDancefloor) {
		
		if(settingCapacityDancefloor>0 && hasDancefloor)
		{
			capacityDancefloor=settingCapacityDancefloor;
			return true;
		}
		return false;
		
	}
	
	//добавление свободных мест на танцполе
	public boolean addFreePlacesDancefloor(int addingFreePlacesDancefloor,boolean returning) {
		
		if(addingFreePlacesDancefloor>0 && hasDancefloor)
		{
			
			freePlaces=freePlaces+addingFreePlacesDancefloor;
			capacity=capacity+addingFreePlacesDancefloor;
			freePlacesDancefloor=freePlacesDancefloor+addingFreePlacesDancefloor;			
			capacityDancefloor=capacityDancefloor+addingFreePlacesDancefloor;
			
			if(returning)
			{
				purchasedPlaces=purchasedPlaces-addingFreePlacesDancefloor;
				purchasedPlacesDancefloor=purchasedPlacesDancefloor+addingFreePlacesDancefloor;
			}
			
			return true;
		}
		return false;
		
	}
	
	//добавление купленных мест на танцполе
	public boolean addPurchasedPlacesDancefloor(int addingPurchasedPlacesDancefloor) {
		
		if(addingPurchasedPlacesDancefloor>0 && hasDancefloor)
		{
			purchasedPlacesDancefloor=purchasedPlacesDancefloor+addingPurchasedPlacesDancefloor;
			freePlacesDancefloor=freePlacesDancefloor-addingPurchasedPlacesDancefloor;
			capacityDancefloor=capacityDancefloor-addingPurchasedPlacesDancefloor;
			freePlaces=freePlaces-addingPurchasedPlacesDancefloor;
			purchasedPlaces=purchasedPlaces-addingPurchasedPlacesDancefloor;
			capacity=capacity-addingPurchasedPlacesDancefloor;
			return true;
		}
		
		return false;
	}
}
