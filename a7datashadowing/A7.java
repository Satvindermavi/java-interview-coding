/*
ham data shadowing ki problem ko this kewword s to solve kar hi sakte hain ,

par lets us try bina this k, iski explanation copy par likhdi hai */


class A7

{

int x= 10;

void show ( A7 a1) // yaha a bhi likh sakte the 
{
int x=20;
System.out.println(x); //20

System.out.println(a1.x); //10

}

public static void main (String hathi[])
{


A7 a = new A7();

a.show(a); // jo object create hua uske refrence ko pass kar diya 

}

}