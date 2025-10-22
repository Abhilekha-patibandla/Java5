package Assignment6;

public class Task2 {
	String name;
	String batch;
	 Task2() {
		this("Abhilekha","55r");
		System.out.println("this method");
	}
	 Task2(String name,String batch){
		 this.name=name;
		 this.batch=batch;
		 System.out.println("Parameterized constructor");
	 }
	 void display() {
		 System.out.print("Name: "+name+" and "+"Batch: "+batch);
	 }

	public static void main(String[] args) {
		Task2 t2=new Task2();
		t2.display();

	}

}
