/*
 void cannot be dereferenced
new Chaining3().Test().Test();


ham chahte the ki ham ek hi line me sabhi ko call karle
                      ^
*/



class Chaining3
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

Chaining3 chain = new Chaining3();

new Chaining3().Test().Test();

}
}