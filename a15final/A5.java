class A 
{

 public static void main (String args[])


 {
   final  int x; // local variable
   x =10;
   x =20;

   System.out.println(x);
  

  }
 
  
}
 
/* 
 : error: variable x might already have been assigned
   x =20;
   ^
1 error
*/
