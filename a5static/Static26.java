//1 proof ki constructor objet par depend karta hai
//isme hamne niche c pe newInstance() ko call n kiya hence is case 
// class dynamically load  ho jayngi and innka constructor call
//bhi ho jayega hoga.

class Static26
{
 Static26()
{
System.out.println("static 26 ka constructor");
}
 static
{
System.out.println("static 26 class is loaded");
}
public static void main(String args[])
{
}
}

class A
{
 A()
{
System.out.println("A  ka constructor");
}
static
{
System.out.println("A ko xtend nhi kiya lekin load hui runtime pe");
System.out.println("command line pe as an argument A ko pas karenge");
}
 public static void main(String hathi[])
{

}
}
class ClassLoading 
{

static
{

System.out.println("classloadind is loaded");
}

public static void main(String hathi[])
{
 try
{
 Class c = Class.forName(hathi[0]);
c.newInstance();
}
catch(Exception e)
{
System.out.println(e);
}
}

}
