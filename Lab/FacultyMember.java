package University;

public class FacultyMember extends Person{
	int employeeID;
	Course[] teachingSchedule=new Course[1];
	
	public void assignCourseToFacultyMember(Course existingCourse, FacultyMember fM)
	{
		fM.addCourseToTeachingList(existingCourse);
	}
	public int getnumberOfUnits(Course existingCourse)
	{
		return existingCourse.numberOfUnits;
	}
	public void addCourseToTeachingList(Course existingCourse)
	{
		Course[] newTeachingSchedule=new Course[teachingSchedule.length+1];
		for (int i = 0; i < teachingSchedule.length; i++) 
		{
			newTeachingSchedule[i] = teachingSchedule[i];
		}
		newTeachingSchedule[(newTeachingSchedule.length)-1]=existingCourse;
		teachingSchedule=newTeachingSchedule;
	}
	public void removeCourseFromTeachingList(Course existingCourse)
	{
		int target=2;
		int scheduleSize=teachingSchedule.length;
		for(int i=target;i<scheduleSize-1;i++)
		{
			teachingSchedule[i]=teachingSchedule[i+1];
		}
		teachingSchedule[scheduleSize-1]=null;
		scheduleSize--;
	}

}
