  class Chaining2
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

Chaining2 chain = new Chaining2();
System.out.println("Normal Tarike se call kiya sabko");
new Chaining2().Test();
new Chaining2().Test();
}
}