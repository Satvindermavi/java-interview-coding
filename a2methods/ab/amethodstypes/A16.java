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

A16 s1  = new A16("mavi", 567);

s1.show();


A16 s2  = new A16();

s2 = s1;

This concept of copying the data is known as deep copying,
is case me poori ki poori memory hi copy ho gayi. aur dono objects ka data same 

ho gya.

s2.show();

}
}