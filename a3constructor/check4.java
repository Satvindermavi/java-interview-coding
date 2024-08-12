class check4
{
/* yaha par naam same hai, paramter type same hai, same 
quantity of the
parameter hai ,hence error ayega
error: method sum(int,int) is already defined in class check4
void sum( int a , int b)
     ^ */
 void sum(int x, int y) 
{
System.out.println("method 1 ka name : sum");
System.out.println(x);
System.out.println(y);

}
void sum( int a , int b)//chahee ye likhlo (int x,int y)mohitdoubt clr
{
System.out.println("method 2 ka name bhi : sum");
System.out.println(a);
System.out.println(b);
}

public static void main(String hathi[])
{
check4  obj = new check4();
obj.sum( 1,2);
obj.sum(3,5);// chahe ye na likho fir bhi error ayega


}
}
