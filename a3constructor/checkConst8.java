class checkConst8
{

checkConst8(int x , int y)

{
System.out.println( "ka name ");
System.out.println(x);
System.out.println(y);

}


public static void main(String hathi[])
{

checkConst8 obj = new checkConst8(1,2);
checkConst8 obj = new checkConst8(1,2);
/*do object ka naam same thore hi rakh sakte hain*/


/* 
 error: variable obj is already defined in method main(String[])
checkConst8 obj = new checkConst8(1,2);
*/
}
}