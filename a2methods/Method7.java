class Method7
{
// pichle program me return type void nahi tha, hence use soplyn
// me daalkar print kar liya tha
// agar return type void hai tab aap use sopln me daalkar print nahi
//kra sakte

void sum(int a, int b)//chahe parametrr na bhi paas karo
{
int x=b;
int y=a;
int z= a+b;
System.out.println("addition of x and y is ="+z);
//return z; aisa return kra sakte hain
}
public static void main(String hathi[])
{
Method7 m7= new Method7();
System.out.println(m7.sum(12,23));

}
}

/*
 error: 'void' type not allowed here
System.out.println(m7.sum(12,23));
*/