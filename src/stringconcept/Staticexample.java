package stringconcept;

public class Staticexample {

	int a;
	static int b;

	static void m1() {
		System.out.println("This is m1 - static method");
	}

	void m2() {
		System.out.println("This is m2 - non static method");

	}
    void m3() // Non static
    {
    	a=500;// non static variable
    	b=1000;// static variable
    	
    	m1();
    	m2();
    	
   }
	
	public static void main(String[] args) // static method
	{
      // static method can access static stuff only
		b = 100;
		System.out.println(b);
		m1();
		
		
		//a=200; // not accessible bcoz it is non static variable
		// m2(); // not accessible bcoz it is non static method
		
		Staticexample se = new Staticexample();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		
		
	}

}
