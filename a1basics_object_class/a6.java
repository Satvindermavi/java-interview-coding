class a6
{

void m1()
{
int a=4;
int b=5;
System.out.println(a+b);
}
public static void main (String args [])
{
m1();
}
}
/*
compile time error
a6.java:12: error: non-static method m1() cannot be referenced from a static context
m1();
*/