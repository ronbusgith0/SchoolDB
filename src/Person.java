
public class Person implements Comparable <Person> {

	private String name;
	private Integer birthYear;

//------------------------------------------------------------//

public Person () {
	
	name = "";
	birthYear = 0;
}

//------------------------------------------------------------//

public Person(String name, int birthYear) {
	
	this.setName (name);
	this.setBirthYear (birthYear);
	
}

//------------------------------------------------------------//

public String getName() { return name; }

public void setName(String name) { this.name = name; }

public int getBirthYear () { return birthYear; }

public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

//------------------------------------------------------------//

@Override
public boolean equals(Object o) {
	if(o instanceof Person) {
		
		Person otherPerson = (Person)o;
		
	if(this.name.contentEquals(otherPerson.getName())) {
			
	if(this.birthYear == otherPerson.getBirthYear()) {
				
		return true;
			}
		}
	}
		return false;
}

//------------------------------------------------------------//

@Override
public String toString() { return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear); }

//------------------------------------------------------------//

public int compareTo(Person p) { return Integer.compare(birthYear, p.birthYear); }
}