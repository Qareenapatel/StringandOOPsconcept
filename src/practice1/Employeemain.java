package practice1;

public class Employeemain {
	
	public static void main(String[] args) {
		
		
			
		//Assigning values to class variables using object - First method
		
		/*Employee emp1 = new Employee();
		    emp1.empid=101;
			emp1.empname="David";
			emp1.salary=25000;
			emp1.deptno=10;
			emp1.display();*/
			
			/*Employee emp2 = new Employee();
			emp2.empid=102;
			emp2.empname="John";
			emp2.salary=55000;
			emp2.deptno=20;
			emp2.display();*/
			
		
		
		//Assigning values to class variables using constructor - Second method
		
		/*Employee emp1 = new Employee(101,"David",25000,10);
		emp1.display();
		
		Employee emp2 = new Employee(102,"John",55000,20);
		emp2.display();*/
		
		//Assigning values to class variables using method - Third method
	
		Employee emp1 = new Employee();
		emp1.setdata(101,"David" , 25000, 10);
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.setdata(102,"John" , 55000, 20);
		emp2.display();
		
	}
}

