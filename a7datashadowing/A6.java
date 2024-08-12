class A6 {

String name;

int age ;


 A6 (String name , int age)

{
name = name;
age = age;

System.out.println("cozz yaha par data shadowing hui thi");

System.out.println("Name"+name);

System.out.println("age"+age);

}

void show()
{
System.out.println("yaha pr default value print hogi instance walee d.m ki");
System.out.println("name"+name);
System.out.println("age"+age);
}


public static void main (String args[])

{

A6 a = new A6("Satvinder Singh", 24);
a.show();

} 

} 