class Init5
{


{
System.out.println("Init Block 1...");
}

public static void main(String args[])
{

Init5 obj = new Init5(); 

{//yaha se init block start hua
System.out.println("Init Block 2... ko method me banaya ,lekin ye normal statement ki tarah behave karega...");
}//yaha par init block khatam hua

System.out.println("init block cant b made in any method or contructor");

}

{
System.out.println("Init Block3...");
}

}