package Assignment6;

public class Task8 {
	
	int a;
	int b;
	int c;
	Task8(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	Task8(int a, int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
	}


	public static void main(String[] args) {
		Task8 t8=new Task8(10,20);
		Task8 t81=new Task8(10,20,30);

	}

}
