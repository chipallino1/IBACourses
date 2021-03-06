package ru.iba.events.entities.events;

import java.io.Serializable;

import ru.iba.events.entities.exceptions.CustomException;

public class Concert extends Event implements Serializable{

	private int capacity;					//	�����������	(����������� �� �� ������� = �����������-����������� �� �������)
	private boolean isSettingCapacity=false;		// 	����������� �� �����������(����������� ��������������� 1 ���)
	private int freePlaces;					//  ����� ���-�� ��������� ����
	private boolean hasDancefloor;    		//  ���� �� �������
	private int capacityDancefloor;			//  ���-�� ���� �� �������� 
	private int freePlacesDancefloor;		//  ���-�� ��������� ���� �� ��������
	private int purchasedPlacesDancefloor;	//  ���-�� ��������� ���� �� ��������
	
	public int getCapacity() {
		
		return capacity;
		
	}	
	public boolean getIsSettingCapacity()
	{
		return isSettingCapacity;
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
		
		if(settingCapacity>0 && !isSettingCapacity)
		{
			capacity=settingCapacity;
			
			return true;
		}
		return false;
		
	}
	//���������� ��������� ���� �� �� �������
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
	
	//���������� ��������� ������� �� �� ��������
	@Override
	public boolean addPurchasedPlaces(int addingPurchasedPlaces) throws CustomException
	{
		if(addingPurchasedPlaces>0 && (capacity-capacityDancefloor-addingPurchasedPlaces)>=0)
		{
			purchasedPlaces=purchasedPlaces+addingPurchasedPlaces;
			freePlaces=freePlaces-addingPurchasedPlaces;
			capacity=capacity-addingPurchasedPlaces;
			
			return true;
		}
		else
		{
			throw new CustomException("No places");
		}
		//return false;
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
	
	//���������� ��������� ���� �� ��������
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
	
	//���������� ��������� ���� �� ��������
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
