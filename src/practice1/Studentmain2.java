package practice1;

public class Studentmain2 {

	int sid;
	String sname;
	char grade;
	
	Studentmain2(int id, String name, char g) //constructor
	{
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	
	
	
	
	void getvalues(int id, String name, char g) //method
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display()	
	{
		System.out.println(sid+"  "+sname+"  "+grade);
		
		
	}

}
