class Type3
{
// int wala chalega kyuki by default integer litrals ko int type ka treat 
// kiya jaata hai
// byte ki range -128 to 127 hai shyad
void show(int a)
{
 System.out.println("int : " +a);
}

void show(short a)
{
 System.out.println("short : " +a);
}

void show(byte a)
{
 System.out.println("byte : " +a);
}
public static void main(String hathi[])
{
 Type3 t = new Type3();
t.show(89);

}
}