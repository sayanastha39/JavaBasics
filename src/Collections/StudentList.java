package Collections;

import java.util.Comparator;

public class StudentList implements Comparator<StudentList> {

	String name;
	int roll;
	
	public StudentList() {
		
	}
	
	public StudentList(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}

	//if we didn't have toString method it's print object id
	@Override
	public String toString() {
		return name + " "+ roll;
	}

	//in ascending order of roll number
	@Override
	public int compare(StudentList s1, StudentList s2) {
		if(s1.getRoll()<s2.getRoll()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
