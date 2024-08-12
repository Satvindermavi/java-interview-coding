/* output : 
Name:Satvinder
Age:24
Address:Address@15db9742
Salary:Salary@6d06d69c

*/




class Employee1 {


String name;
int age;

Salary slr;
Address adr;

/* itne parrt ko globally declare kar diya taaki ise har jagah acces kar paye 
also itna part weak  part the hence isi alag likh paaye
*/

/* pichle program me maine associated data ko psvm me fill kiya tha and is class k 
dm ko maine show method ki help se krwaya tha , is baar mai dono kaam ek hi time 
par karwa rha bo bhi constructor ki help se 

*/

Employee1(String name , int age)
{
/* is chij ko maine kebal ek hi baaar chala hai , hence maine ye kaaam construcor ki  

help se kiya hai  , agar koi dusra object bnayenge uspe bhi ye kebal ek hi baar chalega

and so on ...

*/
this.name= name;
this.age = age;
slr = new Salary(4500,5000,4688);
adr = new Address("pnp","up","India");

}

void show()
{

/*kyuki ye saare metthods maine class type k banaye hain , hnce inhe ham kahi par bhi 
access kar sakte hain. also is method ko mai kayi baar call kar sakta hu hence data 

ko method me print karwaya hai naa ki , constructor me 

*/

System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Address:"+adr); // abhi inme kebal object ka refrence id ha
System.out.println("Salary:"+slr);// addrss class k and salary class k
}
public static void main(String hathi[])

{
Employee1 e = new Employee1("Satvinder",24);
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