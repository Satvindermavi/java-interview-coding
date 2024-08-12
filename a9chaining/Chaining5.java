/*
 void cannot be dereferenced
new Chaining2().Test().disp();
                      ^
*/

class Chaining5
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

Chaining5 chain = new Chaining5();

chain.Test().Test();

}
}