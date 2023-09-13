public class GeneralStaff extends Employee {

private String duty; 

public GeneralStaff() { this.duty = ""; }

public GeneralStaff (String duty) { this.duty = duty; }

public GeneralStaff (String deptName,String duty) { super(deptName); this.duty = duty; }

public GeneralStaff (String name,int birthYear,String deptName,String duty) { super (name,birthYear,deptName); this.duty = duty; }

public String getDuty() { return duty; }

@Override
public String toString() { return String.format(super.toString() + " GeneralStaff: Duty: %10s", duty); }

}
