package Assignment6;

public class Task7 {
	
	String name;
    int rollno;
    
    public Task7(String name, int rollno) {
		
		this.name = name;
		this.rollno = rollno;
	}
    public void display() {
    	System.out.println("Name is: "+ name +" \nRollno: "+ rollno);
    }

	public static void main(String[] args) {
		Task7 t7=new Task7("Abhilekha",54);
		t7.display();
	}

}
