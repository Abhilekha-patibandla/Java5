package Assignment6;

public class Task10 {
	
	String name;
	String batch;
	 Task10() {
		this("Abhilekha","55r");
		System.out.println("No Parameterized constructor");
	}
	 Task10(String name,String batch){
		 this.name=name;
		 this.batch=batch;
		 System.out.println("Parameterized constructor");
	 }
	 void display() {
		 System.out.print("Name: "+name+" and "+"Batch: "+batch);
	 }


	public static void main(String[] args) {
		Task10 t10=new Task10();
		t10.display();
		
	}

}
