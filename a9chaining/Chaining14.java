public class Chaining14{

Chaining14 show()
{
System.out.println("show chala");
return this;// non static k pass by default this to hota hi hai
}


Chaining14 disp()
{
System.out.println("disp chala");
return this;
}

void get()
{
System.out.println("get chala");
}
Chaining14()
{

System.out.println("Constructor chala");
}
public static void main(String hathi[])
{
new Chaining14().show().disp().get();

}
}
