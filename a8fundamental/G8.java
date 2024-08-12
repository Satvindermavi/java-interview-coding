
class G8{



public static void main (String hathi[])
{
int a = 3464;
long b = 1l;
long c = a +b; //max of (int,_int,_long) 

// int d = a+b; //nahi likh saktee errro ayega
/*
 error: incompatible types: possible lossy conversion from long to int
int d = a+b; //nahi likh saktee errro ayega
         ^
*/

System.out.println(c);




}

}