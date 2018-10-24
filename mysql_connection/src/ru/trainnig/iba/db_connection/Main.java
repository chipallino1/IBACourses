package ru.trainnig.iba.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static String url="jdbc:mysql://localhost/festival_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String username="root";
	static String pass="10101998Egor";
	public static void main(String[] args) {
		
		try {
			Connection connection=DriverManager.getConnection(url,username,pass);
			PreparedStatement preStatement=connection.prepareStatement("insert into events(name,type,date) values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<2;i++)
			{
				System.out.println("Enter name: ");
				preStatement.setString(1, sc.nextLine());
				System.out.println("Enter type: ");
				preStatement.setString(2, sc.nextLine());
				System.out.println("Enter date: ");
				preStatement.setString(3, sc.nextLine());
				preStatement.addBatch();
			}
			int[] count=preStatement.executeBatch();
			System.out.println("Add "+count.length+" rows!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}

	}

}
