
public class Course implements Comparable <Course> {

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;

//------------------------------------------------------------//

public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {


	this.isGraduateCourse = isGraduateCourse;
	this.courseNum = courseNum;
	this.courseDept = courseDept;
	this.numCredits = numCredits;

}

//------------------------------------------------------------//

public boolean isGraduateCourse() { return isGraduateCourse; }

public int getCourseNum() { return courseNum; }

public String getCourseDept() { return courseDept; }

public int getNumCredits() { return numCredits; }

//------------------------------------------------------------//

public String getCourseName() {

	if(isGraduateCourse == true) {

	return "G" + courseDept + courseNum;
	}

	else if (isGraduateCourse != true) {

		return "U" + courseDept + courseNum;
	}

	return null;
	}

//------------------------------------------------------------//


public boolean equals(Object o) {

	Course other = (Course) o;

	if(this.isGraduateCourse != other.isGraduateCourse)

		return false; 

	if(this.courseNum != other.courseNum)

		return false;

	if(this.courseDept != other.courseDept)

		return false;

	if(this.numCredits != other.numCredits)

		return false;

	else

		return true;
}	

//------------------------------------------------------------//

@Override
public String toString() {

if (isGraduateCourse == true) {
	
	return String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate", getCourseDept(), getCourseNum(), getNumCredits(),isGraduateCourse());
}
else if(isGraduateCourse != true) {

	return String.format("Course: %3s-%3d | Number of Credits: %02d | Undergraduate", getCourseDept(), getCourseNum(), getNumCredits(),isGraduateCourse());
}
	return null;
}
//------------------------------------------------------------//

public int compareTo(Course c) { return Integer.compare(courseNum, c.courseNum); }

}