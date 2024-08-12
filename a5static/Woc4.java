class Woc4
{
int x = 5;

}

class A
{
public static void main(String hathi[])
{
/*
Note:
calling the non static data member using the 
1.objectRefrence.NonstaticDataMember();
*/
Woc4 obj = new Woc4();
System.out.println(obj.x);
}
}