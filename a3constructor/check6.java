class check6
{
/* yaha par naam same hai, paramter type same hai, same quantity of the
parameter NAHI hai ,hence error NAHI ayega
     ^ */
 void sum(int x, int y ,int z) 
{
System.out.println("method 1 ka name : sum");
System.out.println(x);
System.out.println(y);
System.out.println(z);

}
void sum( int a , int b)//chahee ye likhlo (int x,int y)mohitdoubt clr
{
System.out.println("method 2 ka name bhi : sum");
System.out.println(a);
System.out.println(b);
}

public static void main(String hathi[])
{
check6 obj = new check6();
obj.sum( 1,2,6);
obj.sum(3,5);

}
}
