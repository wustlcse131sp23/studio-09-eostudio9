package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	private final Map<String, Student>students;
	//once instance var is created it cannot be changed 
	//cannot intialize another Map to use in its place
	//can modify tho! 
	
	//default constructor --> 0 params 
	public UniversityDatabase() { 
		this.students = new HashMap<>(); 
		
	}
	public void addStudent(String accountName, Student s) {
		students.put(accountName, s); 
	}
	public int getStudentCount() {
		return students.size(); 
	}
	public String lookupFullName(String accountName) {
		Student s = students.get(accountName); 
		if (s == null) {
			return null;
		}
		else {
			return s.getFullName(); 
		}
	}
	public double getTotalBearBucks() { //all students total bearbucks
		double sum = 0; 
		//prep work shows how to iterate thru keys & values
		//need to know how to do one of them 
		for(String account : students.keySet()) {
//set because there cannot be duplicates. will override if it shows up twice
//sets use for each loops because sets are not ordered & can't iterate thru indices
			Student s = students.get(account); 
			sum += s.getBearBucksBalance(); 
		}
		return sum; 
	}

}
