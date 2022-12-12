package University;

public abstract class Course {
	int courseIdentifier;
	int numberOfUnits;
	public void setcourseIdentifier(int courseIdentifier)
	{
		this.courseIdentifier=courseIdentifier;
	}
	public void setnumberOfUnits(int numberOfUnits)
	{
		this.numberOfUnits=numberOfUnits;
	}
	public int getcourseIdentifier()
	{
		return courseIdentifier;
	}
	public int getnumberOfUnits()
	{
		return numberOfUnits;
	}
	

}
