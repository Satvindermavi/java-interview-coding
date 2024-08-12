class check5
{
/* yaha par naam same hai, paramter type same hai, 
same quantity of the
parameter NAHI hai ,hence error NAHI ayega
     ^ */
 void sum(int x, int y ,int z) // wadha nahi nibhaya
{
System.out.println("method 1 ka name : sum");
System.out.println(x);
System.out.println(y);
System.out.println(z);

}
void sum( int a , int b)//chahe ye liklo(int x,int y)mohitSIRdoubt clr
{
System.out.println("method 2 ka name bhi : sum");
System.out.println(a);
System.out.println(b);
}

public static void main(String hathi[])
{
check5  obj = new check5();
obj.sum( 1,2);
obj.sum(3,5);// chahe ye na likho fir bhi error ayega

/* mai soch rha the errror ayega isme kyuki main pehle sum k saath 
waada kiya the ki jab bhi ise call karenge to teen integer paas 
karenge,lekin yaha par actual me hua kya hai ki ,dono baar 
niche waala sum call ho geya hai, upar wala to call hi nahi huya
*/




}
}
