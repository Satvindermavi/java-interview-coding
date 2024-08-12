/*
error: call to this must be first statement in constructor
this(24);
*/

class Chaining19
{
Chaining19()
{

System.out.println("Simplee wala constructor");
this(24);//ISKO FIRST STATEMENT NA BANAKAR DUSRI BANA DIYA

}

Chaining19(int x)
{
System.out.println("Ek Parameter  wala constructor");
}

Chaining19(int x, int y)
{
System.out.println("do parameter wala constructor");
}

public static void main(String hathi[])
{

new Chaining19();
}
}