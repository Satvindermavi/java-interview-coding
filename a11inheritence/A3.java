/*
Name:Satvinder
Age:24
City:pnp
State:up
Country:India
ha:46
ta:45
da:50

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
slr = new Salary(45,50,46);
adr = new Address("pnp","up","India");

/* 
agar ham aise likhte to ham globally declare naa kar paate 

and hence ham niche show me use na kar paate 

 Salary slr = new Salary(45,50,46);
 Addrress adr = new Address("pnp","up","India");

*/



}

void show()
{
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("City:"+adr.city); 
/* yaha par aap ye samjhlo ki data member ko maine
object pe call kiya hai , jaisa ki ham normally kiya karte the starting me , because 

adr hold kiye hue hai Addrrss class k object ki refrence id ko , hence wah use refer 
kar rha hai ,also HAM YAHI KAAM THIS.city LIKHKAR BHI KARWA SAKTE THE 

*/
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