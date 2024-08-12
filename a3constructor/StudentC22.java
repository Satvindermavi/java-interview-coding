class StudentC22 
{
// instance varibales , heap area , space milti hai after creation of
object 
String name;

int rollNo;

StudentC22(String s , int r)//matlab 
{
name =s;
rollNo=r;
}

void showDetails1()
{
System.out.println("name="+name+  ",rollnumber="+rollNo);
}

void showDetails2()
{
System.out.println("name="+name+  ",rollnumber="+rollNo);
}

public static void main (String ...h)
{

StudentC22 s22 =new StudentC22("honey",200280125);

s22.showDetails1();// ye to method hai 
// alag alag method ko aap same object par call kar sakte hain
s22.showDetails2();

}
}