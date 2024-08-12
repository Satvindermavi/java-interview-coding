/*
String wla constructor chala
do parameter wala constructor
Ek Parameter  wala constructor
Simplee wala constructor
*/

class Chaining20
{
Chaining20()
{
this(24);
System.out.println("Simplee wala constructor");


}

Chaining20(int x)
{
this(24,56);
System.out.println("Ek Parameter  wala constructor");
}

Chaining20(int x, int y)
{
this("mavi");
System.out.println("do parameter wala constructor");
}

Chaining20(String y)
{

System.out.println("String wla constructor chala");

}
public static void main(String hathi[])
{

new Chaining20();
}
}