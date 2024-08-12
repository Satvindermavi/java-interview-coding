 class Chaining1 
{

void Test()
{

System.out.println("Test wala chal gya");
}

void disp()
{
System.out.println("display wala chal gya");
}

void show()
{
System.out.println("show wal chal gya");
}


public static void main (String hathi[])
{

Chaining1 chain = new Chaining1();
System.out.println("Normal Tarike se call kiya sabko");
chain.Test();
chain.disp();
chain.show();
}
}