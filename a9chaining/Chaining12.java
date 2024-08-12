class Chaining12
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

Chaining12()
{
System.out.println("constructor chl gya");
}

public static void main (String hathi[])
{
 new Chaining12().show().disp();
 
                                    
}
}
/*
errror
 void cannot be dereferenced
 new Chaining12().show().disp();

agar show kuch return kar deta , to x uspe chal jaata , jaise ki constructr
return karta hai internally , show ne yah kuch return nahi kiya , hence disp()
chalta kispe ?
                        ^
1 error
*/