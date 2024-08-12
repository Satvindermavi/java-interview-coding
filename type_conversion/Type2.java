class Type2
{
  void show( byte a)
 {
System.out.println("byte:"+a);
 }
public class Type1
{
  void show( byte a)
 {
System.out.println("byte:"+a);
 }

 void show(short a)
 {
System.out.println("short:"+a);
 }

 void show(int a)
 {
System.out.println("int:"+a);
 }

void show(float a)
 {
System.out.println("float:"+a);
 }

void show(double a)
 {
System.out.println("double:"+a);
 }

void show(char a)
{
System.out.println("char:"+a);
}

}

public static void main(String args[])
{
  Type1 obj=new Type1();
obj.show(2);
}
}

}
public static void main( String args[])
{
  Type2 t=new Type2();
t.show(2);
}