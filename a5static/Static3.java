class Static3
{
   static int rollNo; 

/* static wale ko class area me memory milti hai , no matter
 object create ho chahe na ho , and alag-alag objects banane par 
iski alag alag copy nahi banti
*/

Static3()

{
rollNo++;
System.out.println("RollNo of placed student:"+rollNo);
}
 

 public static void main (String hath[])

{

 Static3 obj = new Static3();

 Static3 obj1 = new Static3();

 Static3 obj2 = new Static3();


/*
RollNo of placed student:1
RollNo of placed student:2
RollNo of placed student:3
*/
}
}