class check2
{

/* dono methods ka naam same hai lekin ek paraamaterizedd hai dusra
non paramaterized hai hence koi error nahi ayega */
 void sum(int x, int y) 
{
System.out.println("method 1 ka name : sum");
System.out.println(x);
System.out.println(y);

}
void sum()
{
System.out.println("method 2 ka name bhi : sum");
}


 
public static void main(String hathi[])
{
check2  obj = new check2();
obj.sum( 1,2);
obj.sum();



}
}