class Calculator
{
void add()
{
int x = 10;
int y =20;
System.out.println(x+y);
}
int multi(int x , int y)
{
int a=x;
int b=y;
return (a+b);

}
public static void main(String hath[])
{
Calculator c = new Calculator();
c.add();
int x= c.multi(34,78);
System.out.println(x);
}
}