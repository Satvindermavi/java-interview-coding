class A8

{

int x= 10;

void show () // yaha a bhi likh sakte the 
{
int x=20;
System.out.println(x); //20

System.out.println(this.x); //10

}

public static void main (String hathi[])
{


A8 a = new A8();

a.show(); 
}

}