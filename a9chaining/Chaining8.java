
class Chaining8
{

void Test()
{

System.out.println("Test wala chal gya");
}

void disp()
{
System.out.println("display wala chal gya");
}

void show()
{
System.out.println("show wal chal gya");
}

Chaining8()
{
System.out.println("constructor chl gya");
}

public static void main (String hathi[])
{
 Chaining8 obj =new Chaining8();

obj.Chaining8();
}
}
/* error 
How Can i forget this 

In the provided program, the error occurs in the main method where you attempt 
to call 
a constructor as if it were a regular method. Constructors are invoked automatically when an 
object is created using the new keyword, and you don't call them explicitly like regular methods.
*/