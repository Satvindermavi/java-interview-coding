class Static2
{ 
//the default value of the integer is 0

  int rollNo; // non-static , instance variable

Static2()

{
rollNo++;
System.out.println("RollNo of placed student:"+rollNo);
}
 

 public static void main (String hath[])

{

 Static2 obj = new Static2();

 Static2 obj1 = new Static2();

 Static2 obj2 = new Static2();


/*
RollNo of placed student:1
RollNo of placed student:1
RollNo of placed student:1
*/
}
}