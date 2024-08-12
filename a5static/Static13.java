class Static13
{
//Note: static ko bhi aap kisi method ya constructor me nhi bna sakte
static
{
System.out.println("static block 2");
}

public static void main(String args[])

{
 System.out.println("main wala execute hua sabhi staic block k baad");
 System.out.println("basically hua kya hoga ki compile time par ");
System.out.println("default constrctor create hua hoga and staic");
// waha jakar chipak gaye honge
 
 }

static
{
System.out.println("static block 1");
}

static
{
System.out.println("static block 3");
}


}