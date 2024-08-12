class Static22
{
//mat bhulo ki method k kisi na kisi logic k andar likhna hai.

 static
{
System.out.println("static22 class is loaded");
}
public static void main(String args[])
{}
}

class ClassLoading
{

static
{
Static22 s = new Static22();
System.out.println("classloadind is loaded");
}

public static void main(String hathi[])
{

}

}