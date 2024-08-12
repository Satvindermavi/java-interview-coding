/*
error: cannot find symbol
Chaining16(45); // yah par ek dusre constructor ki calling karni chahi
^
  symbol:   method Chaining16(int)
  location: class Chaining16
error : 
The error in the provided Java code 
is due to the attempt to call one constructor from another constructor using a parameterized call.
this keyword can  be used in case of the constructor chaining
*/

class Chaining16
{
Chaining16()
{
System.out.println("Simplee wala constructor");
Chaining16(45); // yah par ek dusre constructor ki calling karni chahi
}

Chaining16(int x)
{
System.out.println("Ek Parameter  wala constructor");
}

Chaining16(int x, int y)
{
System.out.println("do parameter wala constructor");
}

public static void main(String hathi[])
{

new Chaining16();
}
}