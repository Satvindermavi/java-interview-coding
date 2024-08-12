class check1
{

/*matlab agar return type alag alg bhi hai tab bhi do naam k same
 metthdo nahi ho sakte...*/
 int sum() 
{
System.out.println("method 1 ka name : sum");
return 1;
}
void sum()
{
System.out.println("method 2 ka name bhi : sum");
}

public static void main(String hathi[])
{
check1  obj = new check1();
obj.sum();
obj.sum();// chahe ye na likho fir bhi error ayega

/*
StudentC12.java:3: error: invalid method declaration; return type required
 sum()
 ^
StudentC12.java:7: error: invalid method declaration; return type required
sum()
^
2 errors
*/

/*compiler dono sum() ko constructor na treat kar k as a method treat 
karega and error de dega
*/
}
}