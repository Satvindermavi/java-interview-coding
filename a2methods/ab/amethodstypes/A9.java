class A9 implements I 
{


void  m11(I i)

{
System.out.println("m11");
}

public static void main(String hathi[])
 {
 A9 obj = new A9();
 
obj.m11(new A9());
 
}

}

interface I 
{


}

/*
In the provided code, the m11 method of class A10 expects an argument of type I, but
 you're passing an instance of A10 to 
it. This will cause a compilation error because A10 is not implicitly convertible to I.

To resolve the error, you can modify the m11 method to accept an argument of type A10, or you can create an instance of a class that implements the I interface and pass it to the m11 method.

 error: class, interface, or enum expected
Interface I
^
1 error

*/