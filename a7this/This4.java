/* Aise bhi kar sakte hain lekin ye complex haa isilye ham 
 this keword(a refrence variable) ko use me lenge*/
class This4
{
int x =10;

void show(This4 t1)//CLASS TYPE KA VARIABLE LIYA HAI YAHA HENCE HMNE
/* ISE YAHA WAADA KAR DIYA KI JAB AAPKO CALL KAREMGE TO APP ME CLASS
KA OBJECT PAAS KARENGE YA USKA REFREENCE , NICHE HAMNE OBJECT KA 
REFREENC PAAS KAR DIA HAI*/
{
int x= 20;
//
System.out.println(t1.x);//10

System.out.println(x);//20
}
public static void main(String args[])
{
 This4 t = new This4();
 t.show(t);
}



}