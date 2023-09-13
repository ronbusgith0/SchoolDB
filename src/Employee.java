
public class Employee extends Person {

private String deptName;
private static int numEmployees = 0;
private int employeeID;

//------------------------------------------------------------//

public Employee() {
super("", 0);
this.deptName = "";
this.employeeID = ++numEmployees;
}
//------------------------------------------------------------//

public Employee(String deptName) {
super("", 0);
this.deptName = deptName;
this.employeeID = ++numEmployees;
}

//------------------------------------------------------------//

public Employee(String name, int birthYear, String deptName) {
super(name, birthYear);
this.deptName = deptName;
this.employeeID = ++numEmployees;
}

//------------------------------------------------------------//

public String getDeptName() { return deptName; }

public void setDeptName(String deptName) { this.deptName = deptName; }

public static int getNumEmployees() { return numEmployees; }

public int getEmployeeID() { return employeeID; }

//------------------------------------------------------------//

@Override
public boolean equals(Object obj) {

	Employee other = (Employee) obj;

if(this.deptName != other.deptName)

	return false;

if(this.employeeID != other.employeeID)

	return false;

else

	return true;

}

//------------------------------------------------------------//

@Override
public String toString(){

    return String.format("%s Employee: Department: %20s | Employee Number: %3d", super.toString(), deptName, employeeID);
}

//------------------------------------------------------------//

public int compareTo(Employee c) { return this.employeeID - c.employeeID; }
}
