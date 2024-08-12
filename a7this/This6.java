
class This6
{
int x =10;

void show() 
{

System.out.println(x);//10

System.out.println(x);//10
}
public static void main(String args[])
{
 This6 t = new This6();
 t.show();
}

/* ab sammjhte hain ki kaise hu upar saara khel , althouh i guess
 x = 10 was global varible: no no no java me global variable naam ka koi concept nahi hota 
internally niche se object ka reffrence paas hua hoga
t.show()//this.x
upar jaakr void show()//(this.x) hua hoga
*/

}