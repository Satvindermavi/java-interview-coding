/*
 void cannot be dereferenced
new Chaining6().Test().disp().show();
                      ^
1 error
*/

class Chaining6
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



new Chaining6().Test().disp().show();

}
}