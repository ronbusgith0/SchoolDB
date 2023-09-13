public class Student extends Person{
	
	private static int numStudents; 
	private int studentID; 
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate; 
	private String major;

//------------------------------------------------------------//
	
	public Student() {
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		isGraduate = false;
		studentID = numStudents + 1;
		major = "undeclared";
		numStudents++;
	}

//------------------------------------------------------------//
	
	public Student(boolean isGraduate) {
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		studentID = numStudents + 1;
		major = "undeclared";
		numStudents++;
		
	}
//------------------------------------------------------------//
	
	public Student(String major, boolean isGraduate) {
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		studentID = numStudents + 1;
		this.major = major;
		numStudents++;
	}
	
//------------------------------------------------------------//
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		studentID = numStudents + 1;
		this.major = major;
		numStudents++;
	}
	
//------------------------------------------------------------//
	
	public boolean isGraduate() { return isGraduate; }
	
	public int getNumCoursesTaken() { return numCoursesTaken; }
	
	public static int getNumStudents() { return numStudents; }
	
	public int getStudentID() { return studentID; }
	
	public void setIsGraduate(boolean isGraduate) { this.isGraduate = isGraduate; }
	
	public String getMajor() { return major; }
	
	public void setMajor(String major) { this.major = major; }

//------------------------------------------------------------//

	public void addCourseTaken(Course course) {
	    if (numCoursesTaken >= 0 && numCoursesTaken < coursesTaken.length) {
	      
	    	coursesTaken[numCoursesTaken] = course;
	    	numCoursesTaken++;
	    }
	  }

//------------------------------------------------------------//
	
	public void addCoursesTaken(Course[] course) {
		if (numCoursesTaken < coursesTaken.length && course.length <= coursesTaken.length - numCoursesTaken) {
				
				for (int i = 0; i < course.length; i++) {
					addCourseTaken(course[i]);
				}
			}
		}
	
	
//------------------------------------------------------------//
	
	public Course getCourseTaken(int index) {
		if (index >= 0 && index < numCoursesTaken) {
			
			return coursesTaken[index];
		}
		else {
			return null;
		}
	}

//------------------------------------------------------------//
	
	public String getCourseTakenAsString(int index) {
		if(index >= 0 && index < numCoursesTaken) {
		 
			return coursesTaken[index].getCourseDept()+ "-" + coursesTaken[index].getCourseNum();
		}
	
		return ""; 
	}

//------------------------------------------------------------// 
	
	public String getAllCoursesTakenAsString()  {
		
		String results = "";
		
		for (int i = 0; i < numCoursesTaken - 1; i++) {
			
			results = results + getCourseTakenAsString(i) + ", ";
		
		}
		
		results = results + getCourseTakenAsString(numCoursesTaken-1);
		
		return results;
	}

//------------------------------------------------------------//
	
	@Override
	public int compareTo(Person person) {
		
		Student student = (Student) person;
		
		return Integer.compare(this.studentID, student.studentID);
	}

//------------------------------------------------------------//
	
	@Override 
	public boolean equals(Object object) {
		if (object instanceof Student) {
			Student other = (Student)object;
			if (super.equals(object) == true) {
				if (this.studentID == other.studentID && this.coursesTaken == other.coursesTaken && this.numCoursesTaken == other.numCoursesTaken && this.isGraduate == other.isGraduate && this.major == other.major){
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
//------------------------------------------------------------//
	
	@Override
	public String toString() {
		if (isGraduate) {
		      return String.format(super.toString() + " Student: studentID: %04d | Major %20s |       Graduate | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, numCoursesTaken, getAllCoursesTakenAsString());
		    }
		else {
		      return String.format(super.toString() + " Student: studentID: %04d | Major %20s |  Undergraduate | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, numCoursesTaken, getAllCoursesTakenAsString());
		}
	}
}