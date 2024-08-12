class A2
{

A2 m10( A2 a)
//return type hai clas type ka,hence ham class ka object ya uska refrence return krenge

{
System.out.println("m10");
//return new A2(); // jab yah method cal hoga to object return hoga A2 object

//or 
A2 obj1 = new A2();
return obj1;

/* 
NOte: agar object create karne waali statement ko yaha nahi likhoge to :

 error: cannot find symbol
return obj;
       ^
  symbol:   variable obj
  location: class A2
1 error 

wala error ayega.

}


public static void main(String args[])
{
 A2 obj = new A2();

obj.m10(obj); // calling of m10 without holding return vaalue

A2 r10 = obj.m10(obj); //holding the returned objecct in refrence var

System.out.println(r10);// printing the returned value , basically its the refrence id
}

}
