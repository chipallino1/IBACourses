package ru.iba.events.entities;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ru.iba.events.entities.events.Concert;
import ru.iba.events.entities.users.Admin;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		

		Concert concert=new Concert();
		concert.setDate("10.10.1998");
		concert.setTime("00:00");
		System.out.println(concert.getDate());
		System.out.println(concert.getTime());
		
		Admin admin =new Admin();
		admin.setLogin("wefewe");
		admin.setFirstname("Ddd");
		admin.setLastname("Ddd");
		admin.setEmail("sko-er@mail.ru");
		admin.setPhoneNumber("80299172224");
		System.out.println(admin.getLogin());
		System.out.println(admin.getFirstname());
		System.out.println(admin.getLastname());
		System.out.println(admin.getEmail());
		System.out.println(admin.getPhone());
	}

}
