package ru.iba.events.entities;

public class Main {

	public static void main(String[] args) {
		
		Concert concert=new Concert();
		
		concert.setCapacity(10);
		
		try {
			concert.addPurchasedPlaces(10);//if you add more than capacity it will exception
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
