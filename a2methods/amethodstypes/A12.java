class A12  implements I
{

I  m11() 
{
System.out.println("m11 method call hua");
System.out.println("aur uski value ko hold krara store  me");
return new A12();
}

public static void main(String hathi[])

{
 A12 obj = new A12();
 
A12 obj1 = new A12();

obj1 =obj.m11(); 

  

}

}

interface I
{
 
}
/*

 error: incompatible types: I cannot be converted to A12
obj1 =obj.m11();
             ^
1 error

*/

