class StudentC12
{
 sum() /* ye constructor nahi method hai*/ 
{
System.out.println("method 1 ka name : sum");
}
sum()
{
System.out.println("method 2 ka name bhi : sum");
}

public static void main(String hathi[])
{
StudentC12  obj = new StudentC12();
obj.sum();
obj.sum();// chahe ye na likho fir bhi error ayega
/*
StudentC12.java:3: error: invalid method declaration; return type required
 sum()
 ^
StudentC12.java:7: error: invalid method declaration; return type required
sum()
*/
}
}