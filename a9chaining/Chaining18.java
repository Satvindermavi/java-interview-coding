class Chaining18
{
Chaining18()
{
this(24);
System.out.println("Simplee wala constructor");

}

Chaining18(int x)
{
System.out.println("Ek Parameter  wala constructor");
}

Chaining18(int x, int y)
{
System.out.println("do parameter wala constructor");
}

public static void main(String hathi[])
{

new Chaining18();
}
}