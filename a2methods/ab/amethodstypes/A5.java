class B
{



}

class A5 {

 B  m11(B b)
     
{
System.out.println("m11");

return new B();


}

public static void main(String hathi[])
{
 B b = new B(); 
 A5 objA = new A5();

 objA.m11(b);

// OR

objA.m11(new B()); 


}
}





