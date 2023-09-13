import java.util.*;

public class Main {
	
	public static void main(String[] args ) {
	
	 Scanner keyboard = new Scanner(System.in);
	 
	 String courseDept = " ";
	 int courseNum;
	 boolean isGraduateCourse;
	 int numCredits;
	
	 //------------------------------------------------------------------------------------//COURSE
	 
	 String name = " ";
	 int birthYear = 0;
	 String deptName = null;
	 String duty;
	
	//------------------------------------------------------------------------------------//GENERALSTAFF
	
	 int numCoursesTaught = 0;
	 boolean isTenured = false;
	 
	//------------------------------------------------------------------------------------//FACULTY
	 
	 String major = " ";
	 boolean isGraduate = false;
	
	 //------------------------------------------------------------------------------------//STUDENT
	 
	 String userChoice = " ";
	 char startOver = 'Y';
	 
	  
	 while (startOver == ('Y') || (startOver == ('y'))) { 
		 System.out.println("Welcome to the School Database, would you like to input something?"); 
		 userChoice = keyboard.next();
		
	while (userChoice.equalsIgnoreCase("Yes")) {
		System.out.println("Create 3 new Course objects based on input\n" + "Create 3 new Faculty objects based on input\n" + 
		"Create 3 new GeneralStaff objects based on input\n" + "Create 3 new Student objects based on input\n");
	
	//------------------------------------------------------------------------------------//
		
		System.out.print("");
		System.out.println("Enter the following for the first course");
		System.out.println("Enter a Course Department: ");
		courseDept = keyboard.next();
		System.out.println("Enter the three digit Course number: ");
		courseNum = keyboard.nextInt();
		System.out.println("Enter the amount of credits: ");
		numCredits = keyboard.nextInt();
		System.out.println("Enter True or False if course is undergraduate/graduate: ");
		isGraduateCourse = keyboard.nextBoolean();
		System.out.println("COURSE:" );
		Course c1 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		c1.isGraduateCourse();
		System.out.println(c1.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the second course");
		System.out.println("Enter a Course Department: ");
		courseDept = keyboard.next();
		System.out.println("Enter the three digit Course number: ");
		courseNum = keyboard.nextInt();
		System.out.println("Enter the amount of credits: ");
		numCredits = keyboard.nextInt();
		System.out.println("Enter True or False if course is undergraduate/graduate: ");
		isGraduateCourse = keyboard.nextBoolean();
		System.out.println("COURSE:" );
		Course c2 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		c2.isGraduateCourse();
		System.out.println(c2.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the third course");
		System.out.println("Enter a Course Department: ");
		courseDept = keyboard.next();
		System.out.println("Enter the three digit Course number: ");
		courseNum = keyboard.nextInt();
		System.out.println("Enter the amount of credits: ");
		numCredits = keyboard.nextInt();
		System.out.println("Enter True or False if course is undergraduate/graduate: ");
		isGraduateCourse = keyboard.nextBoolean();
		System.out.println("COURSE:" );
		Course c3 = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		c3.isGraduateCourse();
		System.out.println(c3.toString());
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("All courses created: ");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println("*********************************");
		System.out.println("*********************************");
		
	//------------------------------------------------------------------------------------//
		
		System.out.print("");
		System.out.println("Enter the following for the first faculty");
		System.out.println("Enter the person's name: ");
		name = keyboard.next();
		System.out.println("Enter the person's birth year: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter the department they teach: ");
		deptName = keyboard.next();
		System.out.println("Enter if the teacher is tenured: ");
		isTenured = keyboard.nextBoolean();
		
		System.out.println("FACULTY:");
		Faculty f1 = new Faculty (name, birthYear, deptName, isTenured);
		f1.isTenured();
		System.out.println(f1.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the second faculty");
		System.out.println("Enter the person's name: ");
		name = keyboard.next();
		System.out.println("Enter the person's birth year: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter the department they teach: ");
		deptName = keyboard.next();
		System.out.println("Enter if the teacher is tenured: ");
		isTenured = keyboard.nextBoolean();
		
		System.out.println("FACULTY:");
		Faculty f2 = new Faculty (name, birthYear, deptName, isTenured);
		f2.isTenured();
		System.out.println(f2.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the third faculty");
		System.out.println("Enter the person's name: ");
		name = keyboard.next();
		System.out.println("Enter the person's birth year: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter the department they teach: ");
		deptName = keyboard.next();
		System.out.println("Enter if the teacher is tenured: ");
		isTenured = keyboard.nextBoolean();
		
		System.out.println("FACULTY:");
		Faculty f3 = new Faculty (name, birthYear, deptName, isTenured);
		f3.isTenured();
		System.out.println(f3.toString());
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("All faculties created: ");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println("*********************************");
		System.out.println("*********************************");
		
	//------------------------------------------------------------------------------------//
		
		System.out.print("");
		System.out.println("Enter the following for the first general staff");
		System.out.println("Enter the person's name: ");
		name = keyboard.next();
		System.out.println("Enter the person's birth year: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter the department they work in: ");
		deptName = keyboard.next();
		System.out.println("Enter the duty that the person does: ");
		duty = keyboard.next();
		
		System.out.println("GENERAL STAFF:");
		GeneralStaff g1 = new GeneralStaff (name, birthYear, deptName, duty);
		System.out.println(g1.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the second general staff");
		System.out.println("Enter the person's name: ");
		name = keyboard.next();
		System.out.println("Enter the person's birth year: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter the department they work in: ");
		deptName = keyboard.next();
		System.out.println("Enter the duty that the person does: ");
		duty = keyboard.next();
		
		System.out.println("GENERAL STAFF:");
		GeneralStaff g2 = new GeneralStaff (name, birthYear, deptName, duty);
		System.out.println(g2.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the third general staff");
		System.out.println("Enter the person's name: ");
		name = keyboard.next();
		System.out.println("Enter the person's birth year: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter the department they work in: ");
		deptName = keyboard.next();
		System.out.println("Enter the duty that the person does: ");
		duty = keyboard.next();
		
		System.out.println("GENERAL STAFF:");
		GeneralStaff g3 = new GeneralStaff (name, birthYear, deptName, duty);
		System.out.println(g3.toString());
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("All general staffs created: ");
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(g3.toString());
		System.out.println("*********************************");
		System.out.println("*********************************");
		
	//------------------------------------------------------------------------------------//
		
		System.out.print("");
		System.out.println("Enter the following for the first student");
		System.out.println("Enter the student's name: ");
		name = keyboard.next();
		System.out.println("Enter the student's birthyear: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter a major: ");
		major = keyboard.next();
		System.out.println("Enter if student is a graduate: ");
		isGraduate = keyboard.nextBoolean();
		
		System.out.println("STUDENTS:" );
		Student s1 = new Student(name, birthYear, major, isGraduate);
		s1.isGraduate();
		System.out.println(s1.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the second student");
		System.out.println("Enter the student's name: ");
		name = keyboard.next();
		System.out.println("Enter the student's birthyear: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter a major: ");
		major = keyboard.next();
		System.out.println("Enter if student is a graduate: ");
		isGraduate = keyboard.nextBoolean();
		
		System.out.println("STUDENTS:" );
		Student s2 = new Student(name, birthYear, major, isGraduate);
		s2.isGraduate();
		System.out.println(s2.toString());
		
		System.out.print("");
		System.out.println("Enter the following for the third student");
		System.out.println("Enter the student's name: ");
		name = keyboard.next();
		System.out.println("Enter the student's birthyear: ");
		birthYear = keyboard.nextInt();
		System.out.println("Enter a major: ");
		major = keyboard.next();
		System.out.println("Enter if student is a graduate: ");
		isGraduate = keyboard.nextBoolean();
		
		System.out.println("STUDENTS:" );
		Student s3 = new Student(name, birthYear, major, isGraduate);
		s3.isGraduate();
		System.out.println(s3.toString());
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("All students: ");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Adding 2 new Courses to a Faculty object");
		f1.addCourseTaught(c1);
		System.out.println(f1.toString());
		f1.addCourseTaught(c1);
		System.out.println(f1.toString());
		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Adding 2 new Courses to a Student object");
		s1.addCourseTaken(c1);
		System.out.println(f1.toString());
		s1.addCourseTaken(c1);
		System.out.println(s1.toString());
		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Add an array of 2 Courses to a Faculty object");
		f1.addCourseTaught(c1);
		System.out.println(f1.toString());
		f2.addCourseTaught(c2);
		System.out.println(f2.toString());
		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Add an array of 2 Courses to a Student object");
		s1.addCourseTaken(c1);
		System.out.println(s1.toString());
		s2.addCourseTaken(c2);
		System.out.println(s2.toString());
		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Get the Course at index (valid and invalid indices) from a Faculty object");
		f1.getCourseTaught(numCoursesTaught);
		System.out.println(f1.toString());
		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Get the Course at index (valid and invalid indices) from a Student object");
		s1.getCourseTaken(numCoursesTaught);
		System.out.println(s1.toString());
		System.out.println("");
	
	//------------------------------------------------------------------------------------//
		
		System.out.println("Determine which Facuity object teaches the most and the least courses");

		if (f1.getNumCoursesTaught() > f2.getNumCoursesTaught() && f1.getNumCoursesTaught() > f3.getNumCoursesTaught()) {
		System.out.println("First Faculty object teaches the most courses");
		}

		if(f2.getNumCoursesTaught()> f1.getNumCoursesTaught() && f2.getNumCoursesTaught() > f3.getNumCoursesTaught()) {
		System.out.println("Second Faculty object teaches the most courses");
		}

		if (f3.getNumCoursesTaught()> f2.getNumCoursesTaught() && f3.getNumCoursesTaught() > f1.getNumCoursesTaught()) {
		System.out.println("Third Faculty object teaches the most courses");
		}
		
	//------------------------------------------------------------------------------------//

		if(f1.getNumCoursesTaught() < f2.getNumCoursesTaught() && f1.getNumCoursesTaught() < f3.getNumCoursesTaught()) {
			System.out.println("First Faculty object teaches the least courses");

		}

		if (f2.getNumCoursesTaught() < f1.getNumCoursesTaught() && f2.getNumCoursesTaught() < f3.getNumCoursesTaught()) {
			System.out.println("Second Faculty object teaches the least courses");
		}

		if(f3.getNumCoursesTaught() < f2.getNumCoursesTaught() && f3.getNumCoursesTaught() < f1.getNumCoursesTaught()) {
			System.out.println("Third Faculty object teaches the least courses");
		}

		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Determine which Course is the minimum and which is the maximum"); 

		if (c1.getCourseNum() > c2.getCourseNum() && c1.getCourseNum() > c3.getCourseNum()) {
		System.out.println("First course has the maximum number in catalog");
		}

		if(c2.getCourseNum()> c1.getCourseNum() && c2.getCourseNum() > c3.getCourseNum()) {
		System.out.println("Second course has the maximum number in catalog");
		}

		if (c3.getCourseNum()> c2.getCourseNum() && c3.getCourseNum() > c1.getCourseNum()) {
			System.out.println("Third course has the maximum number in catalog");
		}
		
	//------------------------------------------------------------------------------------//

		if(c1.getCourseNum() < c2.getCourseNum() && c1.getCourseNum() < c3.getCourseNum()) {
			System.out.println("First course has the minimum number in catalog");

		}

		if (c2.getCourseNum() < c1.getCourseNum() && c2.getCourseNum() < c3.getCourseNum()) {
			System.out.println("Second course has the minimum number in catalog");
		}

		if(c3.getCourseNum()< c2.getCourseNum() && c3.getCourseNum() < c1.getCourseNum()) {
			System.out.println("Third course has the minimum number in catalog");
		}

		System.out.println("");
	
	//------------------------------------------------------------------------------------//
		
		System.out.println("Determine which Student has the most and least credits");

		if (c1.getNumCredits()> c2.getNumCredits() && c1.getNumCredits() > c3.getNumCredits()) {
			System.out.println("First student has the most amount of credits");

		}

		if(c2.getNumCredits()> c1.getNumCredits() && c2.getNumCredits() > c3.getNumCredits()) {
			System.out.println("Second student has the most amount of credits");
		}

		if(c3.getNumCredits()> c2.getNumCredits() && c3.getNumCredits() > c1.getNumCredits()) {
			System.out.println("Third student has the most amount of credits");
		}
		
	//------------------------------------------------------------------------------------//

		

		if(c1.getNumCredits() < c2.getNumCredits() && c1.getNumCredits() < c3.getNumCredits()) {
			System.out.println("First student has the least amount of credits");

		}

		if(c2.getNumCredits() < c1.getNumCredits() && c2.getNumCredits() < c3.getNumCredits()) {
			System.out.println("Second student has the least amount of credits");
		}

		if(c3.getNumCredits() < c2.getNumCredits() && c3.getNumCredits() < c1.getNumCredits()) {
			System.out.println("Third student has the least amount of credits");
		}

		System.out.println("");
		
	//------------------------------------------------------------------------------------//
		
		System.out.println("Would you like to start over: Y/N");
		
		startOver = keyboard.next().charAt(0);
		if ((startOver == ('Y')) || startOver == ('y')) {
			
			break;
		}
		else if ((startOver == ('N')) || (startOver == ('n'))) {
			System.out.println("Goodbye");
		}
		keyboard.close();
	
	//------------------------------------------------------------------------------------//
				
			}
			
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
