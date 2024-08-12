class This2
{
int x =10;

void show()
{
int x= 20;
//data shadowing ki wjah se local variable ko prerfrence milegi
System.out.println(x);//20
System.out.println(x);//20
}
public static void main(String args[])
{
 This2 t = new This2();
 t.show();
}



}