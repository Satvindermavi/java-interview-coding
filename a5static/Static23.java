class Static23
{
//mat bhulo ki method k kisi na kisi logic k andar likhna hai.

 static
{
System.out.println("static22 class is loaded");
}
public static void main(String args[])
{}
}
class A
{
static
{
System.out.println("isko classLoading ne extend kar liya");
}
 public static void main(String hathi[])
{

}
}
class ClassLoading extends A 
// agar ye isko extend nahi karta to A waali load na hoti jab 
// java ClassLoading command kihte
{

static
{
Static23 s = new Static23();
System.out.println("classloadind is loaded");
}

public static void main(String hathi[])
{

}

}