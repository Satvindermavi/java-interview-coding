/*
Note:
calling the non static data member using the
 
1 object.NonstaticDataMember();
*/



class Static28
{
int x = 5;

}

class A
{
public static void main(String hathi[])
{


System.out.println(new Static28().x);
}
}