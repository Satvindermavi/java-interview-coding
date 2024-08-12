//1 proof ki constructor objet par depend karta hai
//isme hamne niche c pe newInstance() ko call nahi kiya hence is case 
// load to ho jayngi lekin innka constructor call nahi hoga

class Static25
{
 Static25()
{
System.out.println("static 25 ka constructor");
}
 static
{
System.out.println("static 25 class is loaded");
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
}
catch(Exception e)
{
System.out.println(e);
}
}

}
