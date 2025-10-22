package Assignment6;

public class Task4 {
	
	void display(Task4 t) {
		System.out.println("Method invoking using this");
	}
	void show(){
		display(this);
	}

	public static void main(String[] args) {
		Task4 t4=new Task4();
		t4.show();

	}

}
