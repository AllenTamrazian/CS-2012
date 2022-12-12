package LabAssignment2;


public class MyDateClass {
	//initialize date parameters
	private int month;
	private int day;
	private int year;
	//create constructor
    MyDateClass() {
    	
    }
    //setDate method
	public void setDate(int month, int day, int year)
	{
		//get parameters and assign them to variables in this class
		this.month=month;
		this.day=day;
		this.year=year;
	}
	//getDate- return date as a String
	public String getDate()
	{
		 return (month+"/"+day+"/"+year);
	}
	
		
}
