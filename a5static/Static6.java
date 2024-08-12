class Static6
{
int x=4;// x is a non static data member
public static void main(String args[])

{
/*non Static data member ko call karne ka dusra tarik*/
 Static6 obj = new Static6();
 System.out.println(obj.x);
}

}