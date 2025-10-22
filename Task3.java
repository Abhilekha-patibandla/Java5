package Assignment6;

public class Task3 {
	
	int rollno=54;
	void setRollno(int rollno){
		this.rollno=rollno;
	}
	public void display() {
		System.out.println("roll no: "+rollno);
	}

	public static void main(String[] args) {
		Task3 t3=new Task3();
		t3.setRollno(63);
        t3.display();
	}

}
