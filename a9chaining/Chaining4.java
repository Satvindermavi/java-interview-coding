/*
 void cannot be dereferenced
new Chaining2().Test().disp();
                      ^
*/

class Chaining4
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

Chaining4 chain = new Chaining4();

new Chaining4().Test().disp();

}
}