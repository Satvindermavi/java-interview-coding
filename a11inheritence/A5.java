/*
Name:Satvinder
Age:24
Exception in thread "main" java.lang.NullPointerException
        at Employee.show(A5.java:24)
        at Employee.main(A5.java:35)

ts explanation is written in the notes

*/
class Employee {


String name;
int age;

Salary slr;
Address adr;


Employee(String name , int age)
{
this.name= name;
this.age = age;
//Salary slr = new Salary(45,50,46);
//Address adr = new Address("pnp","up","India");

}

void show()
{
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("City:"+adr.city);
System.out.println("State:"+adr.state);
System.out.println("Country:"+adr.country);
System.out.println("ha:"+slr.ha);
System.out.println("ta:"+slr.ta);
System.out.println("da:"+slr.da);
}
public static void main(String hathi[])

{
Employee e = new Employee("Satvinder",24);
e.show();
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