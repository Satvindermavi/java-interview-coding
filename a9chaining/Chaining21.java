class Test
{

}
class Chaining21
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

Chaining21()
{
System.out.println("constructor chala");
//internally this return kiya, and usme current object ki refrnce id ahi
}


public static void main(String ss[])
{ 
new Chaining21().disp().disp1();

}

}

/*
 error: incompatible types: Chaining21 cannot be converted to Test
return this;
       ^
Chaining21.java:29: error: cannot find symbol
new Chaining21().disp().disp1();
                       ^
  symbol:   method disp1()
  location: class Test
*/