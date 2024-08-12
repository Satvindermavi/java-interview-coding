class C13
{


public static void main(String args[])

{

float a = 45.6f;
int b =a;
System.out.println(b);


double c = 45.6;
int d =c;
System.out.println(d);


int e = 4.5f;
System.out.println(e);



}

}
/*


error: incompatible types: possible lossy conversion from float to int
int b =a;
       ^
C13.java:15: error: incompatible types: possible lossy conversion from double to int
int d =c;
       ^
C13.java:19: error: incompatible types: possible lossy conversion from float to int
int e = 4.5f;
        ^

*/