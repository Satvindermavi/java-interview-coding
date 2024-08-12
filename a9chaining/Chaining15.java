/*
this keyword can also be used in case of the constructor chaining
*/

class Chaining15
{
Chaining15()
{
System.out.println("Simplee wala constructor");
}

Chaining15(int x)
{
System.out.println("Ek Parameter  wala constructor");
}

Chaining15(int x, int y)
{
System.out.println("do parameter wala constructor");
}



public static void main(String hathi[])
{

new Chaining15();
}


}