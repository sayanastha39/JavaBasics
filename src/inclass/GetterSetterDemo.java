package inclass;

public class GetterSetterDemo {
	//instance variable should be set as private so that it is not directly exposed and accessed through getters and setters.
	private int id;
	private String name;
	
	

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
	}
	//you don't need this if arg is diff name as the global variable in class
	public void setId(int i) {
		id = i;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
