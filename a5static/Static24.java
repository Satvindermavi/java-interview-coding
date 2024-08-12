

//mat bhulo ki logic ko kisi na kisi method   k andar likhna hai.
// isme ham na extend karenge , na hi object create karenge, na 
//hi variable ka sahara lenge , lekin phir bhi dynamically
//runtime par load karenge
/* and this is ALL POSSIBLE because of the ,forName() of the 
class "Class" of java present in the java.lang package*/

class Static24
{

 static
{
System.out.println("static 24 class is loaded");
}
public static void main(String args[])
{
}
}

class A
{
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
 Class.forName(hathi[0]);
}
catch(Exception e)
{
System.out.println(e);
}
}

}
/*
Exception throw kiya tha 
 error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
 Class.forName(hathi[0]);
              ^
*/