package ru.iba.events.entities;

public abstract class Event {
	protected int ID;
	protected String Name;
	protected String Date;
	
	abstract public int getID();
	abstract public String getName();
	abstract public String getDate();
	
	abstract public boolean setID(int idSetting);
	abstract public boolean setName(String nameSetting);
	abstract public boolean setDate(String dateSetting);
	
	
}
