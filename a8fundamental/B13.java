class B13
{

public static void main(String hathi[])
{ 
byte a =127;
char x1 = a;
System.out.println(x);

int b =127;
char x2 = b;
System.out.println(x);

short c =127;
char x3 = c;
System.out.println(x);


long d=127;
char x4 = d;
System.out.println(x);

/*
char x = 127;
System.out.println(x);// ⌂
*/

}
}
/*
error: incompatible types: possible lossy conversion from byte to char
char x = a;
         ^

     
B13.java:11: error: incompatible types: possible lossy conversion from int to char
char x = b;
         ^

     
B13.java:15: error: incompatible types: possible lossy conversion from short to char
char x = c;
         ^

B13.java:20: error: incompatible types: possible lossy conversion from long to char
char x = d;

*/
         ^

