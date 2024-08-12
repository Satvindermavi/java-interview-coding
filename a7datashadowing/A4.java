/* 

Before moving further , lets go through some more problems, 

*/

class A4 {

String name= "Manjinder Singh" ;

int age= 22;


A4 (String name , int age)

{
name = name;
age = age;

System.out.println("Name"+name);

System.out.println("age"+age);

}

public static void main (String args[])

{

A4 a4 = new A4("Satvinder Singh", 24);

} 

} /* yaha par bhi priority local wale ko mili , Satvinder jaakar 
A4 k local me jaakr store ho gya */