package Assignment6;

public class Task9 {
	
	
	    int id;
	    String name;

	    
	    Task9(int i, String n) {
	        id = i;
	        name = n;
	    }

	    
	    Task9(Task9 t) {
	        id = t.id;
	        name = t.name;
	    }

	    void display() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }

	    public static void main(String[] args) {
	        Task9 t1 = new Task9(101, "Abhilekha"); 
	        Task9 t2 = new Task9(t1);               

	        System.out.println("Original Object:");
	        t1.display();

	        System.out.println("Copied Object:");
	        t2.display();
	    }
	}



