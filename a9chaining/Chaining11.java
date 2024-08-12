class Chaining11
{
int x=5;
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

Chaining11()
{
System.out.println("constructor chl gya");
}

public static void main (String hathi[])
{

 new Chaining11().show().x; 
                                    
}
}
/*
 not a statement
 new Chaining11().show().x;
*/
/*agar show kuch return kar deta , to x uspe chal jaata , jaise ki constructr
return karta hai internally , show ne yah kuch return nahi kiya , hence x
chalta kispe ?
*/