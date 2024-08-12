public class Chaining13{

Chaining13 show()
{
System.out.println("show chala");
return this;// non static k pass by default this to hota hi hai
}


void disp()
{
System.out.println("disp chala");
}

Chaining13()
{

System.out.println("Constructor chala");
}
public static void main(String hathi[])
{
new Chaining13().show().disp();

}
} 
/*
output
Constructor chala
show chala
disp chala

*/