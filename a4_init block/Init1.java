 class Init1
{

int x;

Init1()
{
x=10;
System.out.println("constructor wala x waad me:" +x);
}

{
x=20;
System.out.println("isko likha,constructor k niche hai par fir bhi");
System.out.println("yah constructor k pehle chalega");
System.out.println("Init wala wala x pehle chalega:" +x);
}

public static void main(String args[])
{

Init1 obj = new Init1(); 
}
}