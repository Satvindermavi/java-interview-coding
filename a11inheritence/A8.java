// inheritence 

class Base6 
{

int x =10;

void m()
{

}
void show()
{
System.out.println("Show of base");
}


Base6()
{
System.out.println(x);
show(); // yah par directly call kar sakte hain
}



public static void main(String args[])
{
System.out.println(new Base6().x);
new Base6().show();
Base6 b = new Base6();
System.out.println(b.x);
b.show();
}
}

// these all are applcable with the child class also

class Child6 extends Base6
{
/*public static void main(String args[])
{
System.out.println(new Base().x);
new Base6().show();
Base6 b = new Base6();
System.out.println(b.x);
b.show();
NOTE : Aise bhi chal jayegaa. lekin phir extend krane ka 
kya faydaa child ko use karo
*/

public static void main(String args[])
{
System.out.println(new Child6().x);
new Child6().show();
Child6 b = new Child6();
System.out.println(b.x);
b.show();
}
}
