class Student8
{
int a,b;
String c;
void info()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
public static void main(String hathi[])
{
Student8 s1;
s1 =new Student8();
s1.a=12;
s1.b=89;
s1.c="satvinder";
s1.info();


 Student8 s2 

s2=new Student8();

s2.a=5;
s2.b=6;
s2.c="java";
s2.info();

// ab kuch khelte hain

s1=s2;  // s2 id waali s1 me store karwa dee 
s1.info();// isse kya hoga ki jo kuch hamne s2 me storer karwaya 
//tha wah
// as it is store ho jayega s1 me


}
}