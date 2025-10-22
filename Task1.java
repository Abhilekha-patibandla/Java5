package Assignment6;

public class Task1 {
	String name;
	String batchName;
	public Task1(String name, String batchName) {
		this.name=name;
		this.batchName=batchName;
	}

	public static void main(String[] args) {
		Task1 t1=new Task1("Abhilekha","55r");
		System.out.println(t1.name);
		System.out.println(t1.batchName);

	}

}
