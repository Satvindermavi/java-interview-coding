class A15 
{


String S_name;
int R_no;
 A15(String s , int n)
{

S_name = s;

R_no = n;

System.out.println("consstructor call hua ");

}
public static void main (String args[])
{

A15 obj  = new A15("mavi", 567);

A15 obj1 = new A15();

}
}
/*
error: constructor A15 in class A15 cannot be applied to given types;
A15 obj1 = new A15();
           ^
  required: String,int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/