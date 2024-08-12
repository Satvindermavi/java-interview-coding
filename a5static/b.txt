/*
Note:
calling the non static data member using the 
1 .NonstaticDataMember;  IN THE DIFFERENT CLASS
*/

class Static30
{
int x = 5;

}

class A
{
public static void main(String hathi[])
{

Static30 obj = new Static30();
System.out.println(.x);// SYNTAX HI GALAT LIKH DIYA . NAHI LAGTA
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