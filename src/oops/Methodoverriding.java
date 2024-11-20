package oops;


class Father
{
	public void education() {
		System.out.println("Bsc");
	}
public void job() {
	System.out.println("Engineer");
}
 }

class Son extends Father
{

	@Override
	public void education() {
	System.out.println("Btech");
		super.education();
	}

	@Override
	public void job() {
		System.out.println("Designer");
		super.job();
	}

public class Methodoverriding {
	
public static void main(String[]args) {
	
}
}
}
