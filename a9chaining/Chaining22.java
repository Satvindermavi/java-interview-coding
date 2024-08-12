class Test
{

}
class Chaining22
{
 
Test disp()
{
System.out.println("disp chala");
return this;
}


void disp1()
{
System.out.println("disp1 chala");
}

Chaining22()
{
System.out.println("constructor chala");

}

public static void main(String ss[])
{ 
new Chaining22().disp().disp1();

}

}
