package University;

public class Student extends Person{
	int CIN;
	Course[] schedule=new Course[1];
	public void addCourseToList(Course newCourse)
	{
		Course[] newSchedule=new Course[schedule.length+1];
		for (int i = 0; i < schedule.length; i++) 
		{
			newSchedule[i] = schedule[i];
		}
		
		newSchedule[(newSchedule.length)-1]=newCourse;
		schedule=newSchedule;
	}
	public void removeCourseFromList()
	{
		int target=2;
		int scheduleSize=schedule.length;
		for(int i=target;i<scheduleSize-1;i++)
		{
			schedule[i]=schedule[i+1];
		}
		schedule[scheduleSize-1]=null;
		scheduleSize--;
	}
	
}