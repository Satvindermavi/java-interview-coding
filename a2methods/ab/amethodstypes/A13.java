
class A13  implements I
{

I  m11() 
{
System.out.println("m11 method call hua");
System.out.println("aur uski value ko hold krara store  me");
return new A13();
}

public static void main(String hathi[])

{
 A13 obj = new A13(); 

  I1 store = obj.m11();

System.out.println(store);

}

}

interface I
{
 
}

interface I1
{

}
/*

error: incompatible types: I cannot be converted to I1
  I1 store = obj.m11();
                    ^
1 error

*/


