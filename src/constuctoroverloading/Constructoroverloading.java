 package constuctoroverloading;

public class Constructoroverloading {

	
		
		int a=0;
		int b=0;
		double c=0;
		
		Constructoroverloading() // First	
		{
			a=10;
			b=20;
			c=20.5;
		}
		
		Constructoroverloading(int x, int y) // Second 	
		{
			a=x;
			b=y;
		}
		
		Constructoroverloading(int x, double y) // Third	
		{
			a=x;
			c=y;
		}
		
		Constructoroverloading(int x, int y, double z) // Fourth	
		{
			a=x;
			b=y;
			c=z;
		}
		
		Constructoroverloading(int x, double y, int z) // Fifth	
		{
			a=x;
			b=z;
			c=y;
		}
		
		void display()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		
		
		
		
			public static void main(String[] args) {
		
				/*Constructoroverloading co = new Constructoroverloading(); // First constructor
				co.display();*/
				
				/*Constructoroverloading co = new Constructoroverloading(10,20); // Second constructor
				co.display();*/
			
				/*Constructoroverloading co = new Constructoroverloading(10,20.5); // Third constructor
				co.display();*/
				
				/*Constructoroverloading co = new Constructoroverloading(10,20,20.5); // Fourth constructor
				co.display();*/
				
				Constructoroverloading co = new Constructoroverloading(10,20.5,30); // Fifth constructor
				co.display();
			}
	}


