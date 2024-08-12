class Static12
{
void main()
{
 System.out.println("khud ka main");
}


void main(int s)
{
System.out.println("parameter wala main chala");
}

int main(String s)
{
System.out.println(s);
return 44;
}
public static void main(String args[])

{ 
 Static12 obj = new Static12();  
 obj.main();
 //AGAR METHOD STATIC NAHII HAI TO USSE OBJECT PE CALL KARNA IS THE 
// STANDARD APPROACH 
 obj.main(45);
 obj.main("honey");
/*
 Static12.main("honey"); //class name se nhi kr sakte non static ko

System.out.println("Contract wala main Chala ");
 }


}
/*
khud ka main
parameter wala main chala
honey
Contract wala main Chala
*/