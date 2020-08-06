package Collections;

import java.util.Set;
import java.util.TreeSet;

public class StudentListTest {

	public static void main(String[] args) {
		
		TreeSet <StudentList> st = new TreeSet<>(new StudentList() );
		
		st.add(new StudentList("Apple", 11) );
		st.add(new StudentList("Ball", 52) );
		st.add(new StudentList("Cat", 3) );
		st.add(new StudentList("Hill", 23) );
		
		//print all the student form list
		for(StudentList s: st)  {
			System.out.println(s);
		}
		
		//get max roll
		System.out.println("max roll"+ st.last());
		System.out.println("min roll"+ st.first());
	}

}
