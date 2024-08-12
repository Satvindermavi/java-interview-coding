/* har constructor ka kuch na kuch return type hota hai  

uska return type class type kaa hota hai , 


and wo return karta hai class ka object  , in the form of this 

*/

class Chaining9
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

Chaining9() // Internally : Chaining9 Chaining9()
{
System.out.println("constructor chl gya");
}

public static void main (String hathi[])
{
 Chaining9 obj =new Chaining9().Test();

//or 

//new Chaining9().Test();

/* 
expected the same error, hence same chal rha
types: void cannot be converted to Chaining9
 Chaining9 obj =new Chaining9().Test();
*/
                                    ^
}
}