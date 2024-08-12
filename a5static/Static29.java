/*
Note:
calling the non static data member using the 
1.objectRefrence.NonstaticDataMember();
*/


class Static29
{
int x = 5;

}

class A
{
public static void main(String hathi[])
{

Static29 obj = new Static29();
System.out.println(obj.x);
}
}