/*
class A3
{

 A50 showData()
   {
System.out.println("mavi");

// return new A50();

// or 


A50 objB = new A50(); 
// agar ye statement hamne psvm me likhi hoti to cannot find 

return objB; 
}

public static void main(String hathi[])
{
A3 obj = new A3();
obj.showData();

System.out.println(obj);
obj = obj.showData();

System.out.println(obj);
}
}

class A50
{

}
*/

class A3
{

void  m11(A3 a) 
/*
yah par hamne is ye bola ki jab bhi isse call karenge
to call karte waqt isme ham Argument of type A3 pass karennge , yah par ham class 
type ka parameter pass karenge 
*/

{
System.out.println("m11");
}
public static void main(String args[])
{

 A3 obj = new A3();//creating first instance
 A3 a = new A3();// creating second instance

obj.m11(a);// paasing an instance of class A2
 a.m11(obj);//paasing an instance of class A2

// OR

obj.m11(new A3());
 
}
}
