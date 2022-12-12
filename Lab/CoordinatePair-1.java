/* This program can set and get a coordinate pair, convert a coordinate pair into a format 
 * that is easy to read, compare if two coordinates are equal, and get the distance between
 * the two coordinates using Pythagorean theorem.
 */
package Checkpoint1;

public class CoordinatePair {
	//constructor with no arguments
	public CoordinatePair() {
		
	}
	//initialize variables
	int x1;
	int y1;
	//constructor with two arguments
	public CoordinatePair(int x1, int y1) {
			this.setX1Value(x1);
			this.setY1Value(y1);
		}
	//setter method for x value
	public void setX1Value(int x1)
	{
		this.x1=x1;
	}
	//setter method for y value
	public void setY1Value(int y1)
	{
		this.y1=y1;
	}
	//getter method for x value
	public int getX1Value()
	{
		return this.x1;
	}
	//getter method for y value
	public int getY1Value()
	{
		return this.y1;
	}
	//toString method that puts coordinates in the correct format
	public String toStringMethod()
	{
		String firstPair="CoordinatePair("+x1+","+y1+")";
		return firstPair;
	}
	//method to see if the two pairs are equal
	public boolean equals(CoordinatePair otherPair)
	{
		//if the x value and y values are equal
		if((otherPair.getX1Value())==x1 && otherPair.getY1Value()==y1) {
			return true;
				}
		return false;
	}
	//method to get EuclideanDistance
	public double getEuclideanDistance(CoordinatePair otherPair)
	{
		//find the difference between the two x values and multiply that to itself
		double xValuesSubtractedAndSquared=(otherPair.getX1Value()-x1)*(otherPair.getX1Value()-x1);
		//find the difference between the two y values and multiply that to itself
		double yValuesSubtractedAndSquared=(otherPair.getY1Value()-y1)*(otherPair.getY1Value()-y1);
		//return the square root of the the above values after added
		return Math.sqrt(xValuesSubtractedAndSquared+yValuesSubtractedAndSquared);
	}
}
