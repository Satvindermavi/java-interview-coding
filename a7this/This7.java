
class This7
{
int x =10;

void show() 
{
int x =20;
/*ab is case me compiler ne pehle check kiya ki kahi data shadowing 
to ni ho rhi , yaha par shadowing ho rhi thi hene is baar internaaly
this.x nahi ayega account me.
*/
System.out.println(x);// 20

System.out.println(x);// 20
}
public static void main(String args[])
{
 This7 t = new This7();
 t.show();
}



}