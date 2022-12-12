package LabAssignment2;

public class FullName {
	//initialize name variables
	private String firstName;
	private String lastName;
	public String fullName;
	//Person method for making the full name
	public void Person(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		//assemble full name
		fullName=firstName+" "+lastName;
		//print out the full name
		System.out.print(fullName);
	}
	
}
