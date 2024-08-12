/*
Note:
calling the non static data member using the 
1. NonstaticDataMember;  IN THE DIFFERENT CLASS
*/


class Static31
{
int x = 5;

}

class A
{
public static void main(String hathi[])
{

Static31 obj = new Static31();
System.out.println(x);

}
}

/*
cannot find symbol
System.out.println(x);
                   ^
  symbol:   variable x
  location: class A
1 error
*/


