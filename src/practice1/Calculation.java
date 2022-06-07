package practice1;

public class Calculation {

	int a;
	int b;
		
 //1. method may not takes parameters- empty parameters
 //4. A method may not return any value	
	/*void sum()
	{
		System.out.println(a+b);
	}*/
	
	//2. method takes parameters
	/*void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	
	//3. a method returns some value
	
	int sum()
	{
		return(a+b);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
	//1.method may not takes parameters
	/*	cal.a=100;
		cal.b=200;
		cal.sum();*/

	//2.method takes parameters
		
		/*cal.sum(100,200);*/
			
	// A method returns some value
		cal.a=100;
		cal.b=200;
		int r=cal.sum();
		System.out.println(r);
	}

}
