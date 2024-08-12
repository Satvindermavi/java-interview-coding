class A1
{

A1  m10()
//return type hai clas type ka,hence ham class ka object ya uska refrence return krenge

{
System.out.println("m10");
return new A1();          // jab yah method cal hoga to object return hoga A1 object
}


public static void main(String args[])
{
 A1 obj = new A1();

obj.m10(); // calling of m10 without holding return vaalue
A1 r10 = obj.m10(); //holding the returned objecct in refrence var
System.out.println(r10);// printing the returned value
}

}
