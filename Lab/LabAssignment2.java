/*This program uses the MyDateClass class to set and get the date and the FullName class 
gets the name and prints it out.*/
package LabAssignment2;


public class LabAssignment2 {
	
	public static void main(String [] args) {
		// instantiate object
		MyDateClass obj = new MyDateClass();
		//set date values
		obj.setDate(5,25,2000);
		// display date
		System.out.println(obj.getDate());
		// display name
		FullName fn = new FullName();
		fn.Person("Allen", "Tamrazian");
		} // end main
}
