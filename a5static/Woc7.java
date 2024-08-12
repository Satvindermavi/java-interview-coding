class Static32
{
int x = 5;

Static32()
{
System.out.println("Calling non static data member in the constructor of the same class");
System.out.println("using the third method");
System.out.println(x);
}

void Static32()
{
System.out.println("Calling non static data member in the non static m.f of the same class");
System.out.println("using the third method");
System.out.println(x);
}
public static void main (String hathi[])
{

Static32 obj = new Static32();
System.out.println("***********");
obj.Static32();

}

}

