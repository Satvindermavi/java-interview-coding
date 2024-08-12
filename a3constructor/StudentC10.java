class StudentC10
{

/* yaha par non paramaterize method hain , dono ka naame same nahi ho
 sakta hence error ayega , no matter uska return type same hai
ya diffeerent hai
 */

int sum()
{
System.out.println("method 1 ka name : sum");
}
int sum()
//yaha par void sum() likkhne se bhi errror ayega kyuki naam same hai
{
System.out.println("method 2 ka name bhi : sum");
}

public static void main(String hathi[])
{
StudentC10  obj = new StudentC10();
obj.sum();
obj.sum();// chahe ye na likho fir bhi error ayega
/*
error: method sum() is already defined in class StudentC10
void sum()
*/
}
}