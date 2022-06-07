package practice1;

public class Studentmain {

	public static void main(String[]args)
	{
		Student stu1 = new Student(1010,"John",'A');//3 assign value by using constructor
		
		// 1. assign values by using reference variable
		/*stu1.sid=1010;
		stu1.sname="John";
		stu1.grade='A';*/
		
		//2. assign values by using method
		/*stu1.getvalues(1010, "John", 'A');*/
				stu1.display();
		
		
	}

}
