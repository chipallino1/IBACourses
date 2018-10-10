package ru.iba.events.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ru.iba.events.entities.users.SimpleUser;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		String date="10.  10.  2018";
		date=date.replaceAll(" ", "");
		String[] splits=date.split("\\d{2}\\.\\d{2}\\.\\d{4}");
		
		for(int i=0;i<splits.length;i++)
			System.out.println(splits[i]);

	}

}
