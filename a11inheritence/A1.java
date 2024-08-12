/* yaha par ham employee ki detail ko store karwayenge , chunki address aur salaary 

ko frthwe categories kiya jaa skta hai and hence ham , unk liye alag se class 
bana lenge and use class ko assocciate kra lenge hamari original classme 

*/

class Employee
{
String name;
int age; 

void show (String name , String age)
{
System.out.println("Name of the employee is : "+name);
System.out.println("Age of the employee is : "+age);

}

public static void main(String args[])
{
 Address adr = new Address("chandigarh","morinda","mohali"); 
 Salary slr = new Salary(3400,5300,2600) ;
/* here we have done the association of the Addres class and the Salary class into 
the employee class 
*/

/* khaali itna likhkar bhi kar sakte ho new Addres(); that is : composition
 (Address adr) is the weak part ; // that is : aggregation */
 
System.out.println(new Employee()); // just to print the  refrenc ids
Employee obj = new Employee();
obj.show("Satvinder","24");
System.out.println(adr); // mujhe ye laga tha ki aisa karne se address print hoga 
System.out.println(slr); // lekin aisa karne se to kebal inki refrence id print  hui
}
}
class Address
{
String city,state,country;

Address(String city, String state , String country)
{
this.city = city;
this.state = state;
this.country = country;
}
}

class Salary
 
{
int ta,da,ha;

Salary(int ta , int da , int ha)
{

  this.ta=ta;
this.da = da;
this.ha = ha;
}

}
/*
Employee@15db9742
Name of the employee is : Satvinder
Age of the employee is : 24
Address@6d06d69c
Salary@7852e922
*/