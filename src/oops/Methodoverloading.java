package oops;

public class Methodoverloading {
	public static void main(String[]args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(30, 50);
		ob.add(4.5, 67);
		ob.add(45, 67.98);
	}
public void add() 
{
	int a=30, b=40,c;
	c=a+b;
	System.out.println(c);
	
}

public void add(int a, int b)
{
	int c=a+b;
	System.out.println(c);
}

public void add(int a, double b) {
	double c=a+b;
	System.out.println(c);
}

public void add(double a, int b) {
	double c=a+b;
	System.out.println(c);
}
}












