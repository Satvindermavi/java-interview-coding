class This3
{
int x =10;

void show()
{
int x= 20;
//
System.out.println(this.x);//10

System.out.println(x);//20
}
public static void main(String args[])
{
 This3 t = new This3();
 t.show();
}



}