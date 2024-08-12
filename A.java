
class Employee1

{
	String name;
	int age;
	int salary;
        String address;

   
void   setData(String n , int a , int s , String ad )
{
  
name = n;
age = a;
salary = s;
address = ad
}
             
	
	

	void showDetails()
	{
	System.out.println("Detail of an employee is:");
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	System.out.println("Salary is "+salary);
	System.out.println("Address is "+address);

	}
	
	public static void main(String args[])
	{
		
   Employee1 obj = new Employee1();
obj.setData("satvinder singh ",23 , 45664 , "Bathinda");


	}