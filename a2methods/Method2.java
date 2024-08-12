class Method2
{
void sum1 (int x , int y)// paramaterized without return 

// hamne iske saath promise kar diya kiya jab isse call karenge to isme
// ham do integer type ki values ko pass karenge as an argument

{
int sum =x+y;
System.out.println("The sum of x and y is :"+sum);
//+ concatenate krata hai
}

void sum2 (float x ,float y)
{
float add = x+y;
System.out.println("the addition of the two floats is :"+add);

}

void sum3 (boolean x)
{
if (x ==true)
{
System.out.println("x is true");
}
else
{
System.out.println("x is false");
}



}

public static void main(String hathi[])
{
  Method2 m2=new Method2();
m2.sum1(67,30);
m2.sum2(3.4f,2.4f);
m2.sum3(true);
m2.sum3(false);

}
}