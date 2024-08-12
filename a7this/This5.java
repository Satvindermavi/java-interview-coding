
class This5
{
int x =10;

void show(int x)//internally aisa ha taamjhaam:(int x , this)
//hamne na hi upar wada kiya au na hi niche se object ya object ka
//refence paas kiya, but fir bhi waha se internlly and implictly objct
// ka refrenc paas kiya hai.

// yah bhi iska local variable hi hai
{

System.out.println(t1.x);//10

System.out.println(x);//20
}
public static void main(String args[])
{
 This5 t = new This5();
 t.show(20);//internally aise hua hoga surelly t.show(20,t)
/*
Note : Ye jo kaam internallyy hua hai , isko compiler ne kiya hai
hene tabhi to this keyword k paas objct ki reffrene id pahunch jaati
hai khud b khud
*/
}



}