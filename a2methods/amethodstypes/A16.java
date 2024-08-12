class A16
{
String S_name;

int R_no;


 A16(String s , int n)

{

S_name = s;

R_no = n;

}

void show()
{
System.out.println(S_name);
System.out.println(R_no);

}

A16()
{
 
}

public static void main (String args[])
{

A16 s  = new A16("mavi", 567);

s.show();


A16 s1  = new A16();

s1 = s;

s1.show();

}
}