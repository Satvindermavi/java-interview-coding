class Init3
{

/*
is program me hamne ye proove kara diya ki constructor object specific hota 
hai and initializeer object specific nahi hota
*/
{
System.out.println("Init Block 3...");
}

Init3()
{
System.out.println("constructr chala bina parameter wala");
}

Init3(int x)
{
System.out.println("constructr chala EK parameter wala");
}

Init3(int x , int y)
{
System.out.println("constructr chala do parameter wala");
}
{
System.out.println("Init Block 1...");
}

public static void main(String args[])
{

Init3 obj = new Init3(); 


//Init3 obj1 = new Init3(34);


//Init3 obj2 = new Init3(40,45);


}

{
System.out.println("Init Block 2...");
}

}