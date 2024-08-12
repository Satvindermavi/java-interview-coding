class A 
{

static 
{

System.out.println("inheritnce k case me bhi");
System.out.println("static class loadig hogi , kyuki compiler ko pehle");
System.out.println("hi pata hai ki A class ko load karna hai And B ko");
}

}

class B extends A {

static 
{
System.out.println("B class bhi statically load ho jayegi");
}

public static void main (String args[])
{


}

}