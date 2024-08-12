class Demo
{
int x=10;

void disp(int x,Demo this)
{
System.out.println(this);
System.out.println(x);
System.out.println(x);
}

Demo(Demo this)
{
System.out.println(this);
} 

public static void main(String ss[])
{
Demo d=new Demo(d);
System.out.println(d);
d.disp(30,d);  


Demo d1=new Demo(d1);
System.out.println(d1);
d1.disp(30,d1);


}
}