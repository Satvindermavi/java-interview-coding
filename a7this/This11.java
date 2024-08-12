class This11 {

int x=10;

void show()
{
int x =20;
System.out.println(x);
System.out.println(this);
System.out.println(this.x);
}

// construcor me bhi hoti hai by deffualt

This11()
{

System.out.println(this);
}

public static void main (String ss[]) 
{
This11 t = new This11();
t.show();

}

}