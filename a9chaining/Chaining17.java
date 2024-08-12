class Chaining17
{
Chaining17()
{
System.out.println("Simplee wala constructor");

}

Chaining17(int x)
{
System.out.println("Ek Parameter  wala constructor");
}

Chaining17(int x, int y)
{
System.out.println("do parameter wala constructor");
}

public static void main(String hathi[])
{

new Chaining17().Chaining17(45);
}
}