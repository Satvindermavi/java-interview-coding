class Init4
{

/*
is,me sabhi concstruvctor call hue hain hence sabhi ki repect me chalega
*/
{
System.out.println("Init Block 3...");
}

Init4()
{
System.out.println("constructr chala bina parameter wala");
}

Init4(int x)
{
System.out.println("constructr chala EK parameter wala");
}

Init4(int x , int y)
{
System.out.println("constructr chala do parameter wala");
}
{
System.out.println("Init Block 1...");
}

public static void main(String args[])
{

Init4 obj = new Init4(); 


Init4 obj1 = new Init4(34);


Init4 obj2 = new Init4(40,45);


}

{
System.out.println("Init Block 2...");
}

}