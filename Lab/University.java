package University;

import java.util.Scanner;

public class University {
	Student[] universityStudentsList=new Student[1];
	Course[] universityCourses=new Course[1];
	FacultyMember[] universityFacultyMembers=new FacultyMember[1];
	Scanner sc = new Scanner(System.in);
	Student newStudent = new Student();
	FacultyMember newFaculty = new FacultyMember();
	public Student createUniversityStudent(Student newStudent)
	{
		this.newStudent=newStudent;
		Person newPerson = new Person();
		System.out.println("Please insert a name");
		String name = sc.next();
		newPerson.setName(name);
		System.out.println("Please insert a street number");
		int streetNumber = sc.nextInt();
		newPerson.setStreetNumber(streetNumber);
		System.out.println("Please insert a street name");
		String streetName = sc.next();
		newPerson.setStreetName(streetName);
		System.out.println("Please insert a city name");
		String cityName = sc.next();
		newPerson.setCityName(cityName);
		System.out.println("Please insert a state name");
		String stateName = sc.next();
		newPerson.setStateName(stateName);
		System.out.println("Please insert a country name");
		String countryName = sc.next();
		newPerson.setCountryName(countryName);
		return newStudent;
	}
	public void addUniversityStudent(Student newStudent)
	{
		Student[] updatedStudentList=new Student[universityStudentsList.length+1];
		for (int i = 0; i < universityStudentsList.length; i++) 
		{
			updatedStudentList[i] = universityStudentsList[i];
		}
		updatedStudentList[(updatedStudentList.length)-1]=newStudent;
		universityStudentsList=updatedStudentList;
	}
	public FacultyMember createUniversityFaculty(FacultyMember newFaculty)
	{
		this.newFaculty=newFaculty;
		return newFaculty;
	}
	public void addUniversityFaculty(FacultyMember newFaculty)
	{
		FacultyMember[] updatedFacultyList=new FacultyMember[universityFacultyMembers.length+1];
		for (int i = 0; i < universityFacultyMembers.length; i++) 
		{
			updatedFacultyList[i] = universityFacultyMembers[i];
		}
		updatedFacultyList[(updatedFacultyList.length)-1]=newFaculty;
		universityFacultyMembers=updatedFacultyList;
	}
	public void menuSystem(University newUniversity)
	{
		System.out.println("Select the option that you would like to do.");
		System.out.println("1 to list the students, 2 to create a new student, 3 to add a student to the list");
		System.out.println("4 to list the faculty members, 5 to create a new faculty member, 6 to add a faculty member to the list");
		System.out.println("7 to exit");
		int menuSelection=sc.nextInt();
		try
		{
				switch(menuSelection)
				{
				case 1:
				System.out.print(universityStudentsList);
				case 2:
				newUniversity.createUniversityStudent(newStudent);
				case 3:
				newUniversity.addUniversityStudent(newStudent);
				case 4:
				System.out.print(universityFacultyMembers);
				case 5:
				newUniversity.createUniversityFaculty(newFaculty);
				case 6:
				newUniversity.addUniversityStudent(newStudent);
			}
		}
		catch(Exception ex)
		{
			System.out.print("Something went wrong");
		}
	}

}
