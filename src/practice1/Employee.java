package practice1;

public class Employee {

	int empid;
	String empname;
	int salary;
	int deptno;

	/*Employee(int id, String name, int sal, int dno)// constructor
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}*/

	void setdata(int id, String name, int sal, int dno) // for using third method 
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}

	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}

}
