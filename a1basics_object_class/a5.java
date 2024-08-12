class a5 {

int a=4;
int b=5;

public void m1(){

System.out.println(a+b);

}

public static void main (String args [])
{

m1();
}
}

/*
compile time error
a5.java:11: error: non-static method m1() cannot be referenced
from a static context
m1();
^
*/

/*

void ko mani me likha sara kuch main me likha par fir bhi ni chala 
is baar to

class a5 
{

public static void main (String args [])
{
int a=4;
int b=5;

public void m1()
{
System.out.println(a+b);
}
m1();
}
}
a5.java:9: error: illegal start of expression
public void m1()
^
a5.java:9: error: illegal start of expression
public void m1()
       ^
a5.java:9: error: ';' expected
public void m1()
              ^
*/

