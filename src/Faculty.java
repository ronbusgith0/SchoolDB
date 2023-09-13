
import java.util.*;

public class Faculty extends Employee implements Comparable <Person> {

	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;

//------------------------------------------------------------//

public Faculty() {
	
	super();
	this.coursesTaught = new Course[100];
	this.numCoursesTaught = 0;
	this.isTenured = false;
}

//------------------------------------------------------------//

public Faculty(boolean isTenured) {
	
	this();
	this.isTenured = isTenured;
}

//------------------------------------------------------------//

public Faculty(String deptName, boolean isTenured) {
	
	super(deptName);
	this.coursesTaught = new Course[100];
	this.numCoursesTaught = 0;
	this.isTenured = isTenured;
}

//------------------------------------------------------------//

public Faculty(String name, int birthYear, String deptName, boolean isTenured) {

	super(name, birthYear, deptName);
	this.coursesTaught = new Course[100];
	this.numCoursesTaught = 0;
    this.isTenured = isTenured;
}

//------------------------------------------------------------//

public boolean isTenured() { return isTenured; }

public void setTenured(boolean isTenured) { this.isTenured = isTenured; }

public int getNumCoursesTaught() { return this.numCoursesTaught; }

//------------------------------------------------------------//
	
public void addCourseTaught(Course course) {
	   
	if(numCoursesTaught == coursesTaught.length)
		   
		   return;
    
	   coursesTaught[numCoursesTaught++] = course;
}

//------------------------------------------------------------//

public void addCoursesTaught(Course[] course) {
	
	if(numCoursesTaught + course.length > coursesTaught.length)
		  
		   return;
	   
	   for(int i = 0;i < course.length;i++)
		   
		   coursesTaught[numCoursesTaught++] = course[i];
}

//------------------------------------------------------------//

public Course getCourseTaught(int index) {
	
	if(index >= 0 && index < numCoursesTaught) {
		   
			return coursesTaught[index];
	   }
	   
			return null;
}
  
//------------------------------------------------------------//

public String getCourseTaughtAsString(int index) {
	   
	if(index >= 0 && index < numCoursesTaught) {
		   
		   return coursesTaught[index].toString();
	   }
	   return "";
}

//------------------------------------------------------------//

public String getAllCoursesTaughtAsString() {
	   
	String result = "";
	   
	for(int index = 0; index < numCoursesTaught; index++) {
		   
		result = result + coursesTaught[index].toString();
	   }
	   
		return result;
}

//------------------------------------------------------------//

public boolean equals(Faculty obj) { return this.getEmployeeID() == obj.getEmployeeID(); }

//------------------------------------------------------------//

public String getIsTenured(){

	String tenure = "";

	if(isTenured)

		tenure = "Is Tenured";

	else

		tenure = "Not Tenured";

		return tenure;
}

//------------------------------------------------------------//

@Override
public String toString() { return super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", getIsTenured(), getNumCoursesTaught(), getAllCoursesTaughtAsString()); }

//------------------------------------------------------------//

public int compareTo(Faculty f) { return super.compareTo( (Employee) f); }

}