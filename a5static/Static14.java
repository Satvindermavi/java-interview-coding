class Static14
{

static
{
System.out.println("static block 2");
}

public static void main(String args[])
  
{
 System.out.println("main execute nahi hoga...");

 System.out.println("kyuki hamne niche exit(0) use kiya hai");
 }

static
{
System.out.println("static block 1");
}

static
{
System.out.println("static block 3");
System.exit(0);
// jaha par bhi isse use karoge uske aage program execute nahi hoga
}


}