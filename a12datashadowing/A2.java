class DataShadowingParent1 
{
int x=10;
}

class DataShadowingChild1 extends DataShadowingParent1
{
int x = 20;
void show()
{

System.out.println("yaha par data hiding hogi , child waala parent wale par shadow ");
System.out.println(x);

}


public static void main(String args[])

{
   DataShadowingChild1 obj = new DataShadowingChild1();

  obj.show();
}
}