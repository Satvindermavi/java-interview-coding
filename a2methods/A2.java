class A3
{

void  m11(A3 a) 
/*
yah par hamne is ye bola ki jab bhi isse call karenge
to call karte waqt isme ham Argument of type A2 pass karennge , yah par ham class 
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
 
}
}