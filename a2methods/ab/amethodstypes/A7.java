
class B7
{



}

class A7 {

 B7  m11()
     
{
System.out.println("A7");

return objB7;


}

public static void main(String hathi[])
{
 
A7 obj  = new A7();

B7 objB7 = new B7();
 
}
}

/*

To correct the error in your code, you need to ensure that the objB7 
object is declared and instantiated before it is returned in the m11 method
 of class A7. 
error: cannot find symbol
return objB;
       ^
  symbol:   variable objB
  location: class A7
1 error

*/





