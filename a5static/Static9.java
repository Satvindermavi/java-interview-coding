class Static9
{
int x=4;

Static9()
{
System.out.println("constructor wala:"+x);
}

void show()
{
System.out.println("show wala x:"+x);
}

public static void main(String args[])

{
 Static9 obj = new Static9();
obj.show();// method apne aap nahi chala , isko khud se call karwana 
// parta hai , ye show method hai ye non static hai

 }


}