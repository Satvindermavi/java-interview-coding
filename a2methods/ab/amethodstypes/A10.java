/*
que. class A10
{


void  m11(I i)
{
System.out.println("m11");
}

public static void main(String hathi[])
{
}
}

interface I 
{


}

*/

class A10 implements I 
{


void  m11(I i)

{
System.out.println("m11");
}

public static void main(String hathi[])
 {
   A10 obj = new A10();

 obj.m11(obj);
 
}

}

interface I 
{


}