class Woc5
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
1 .NonstaticDataMember;  IN THE DIFFERENT CLASS
*/
Woc5 obj = new Woc5();
System.out.println(.x);
}
}

/*
errorr ayega:
 illegal start of expression
System.out.println(.x);
                   ^
Woc5.java:17: error: ';' expected
System.out.println(.x);
                    ^
Woc5.java:17: error: illegal start of expression
System.out.println(.x);                    ^
*/