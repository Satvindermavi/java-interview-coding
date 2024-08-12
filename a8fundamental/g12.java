class g12
{


public static void main (String hathi[])
{
 long a = 9223372036854775807 ; 

/* was expecting ki , this would get printed but the compiler

 treated it as the integer not float , and this number was

way beyond the range of integer and hence we got the error 

*/

 System.out.println(a); 

}
}
/*

 error: integer number too large: 9223372036854775807
 long a = 9223372036854775807 ;

*/