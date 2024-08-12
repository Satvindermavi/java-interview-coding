class This10
{
String name;

int age;

void disp()
{

System.out.println(name);
System.out.println(age);
}
void set()
{
this.name = "Satvinder Singh";
this.age  = 45;
}

}

class Test 
{

String name;
int age;

void set()
{
this.name = "Satvinder Singh";
this.age  = 45;
}
void disp()
{

System.out.println(name);
System.out.println(age);
}

public static void main (String hathi[])
{

This10 obj = new This10();
obj.set();
obj.disp();


Test obj1 = new Test();
obj1.set();
obj1.disp();


}

}