package Assignment6;

public class Task5 {
	
	Task5 A(){
		return this;
		
	}
	void display() {
		System.out.println("current class instance");
	}

	public static void main(String[] args) {
		Task5 t5=new Task5();
		t5.A().display();
	}

}
