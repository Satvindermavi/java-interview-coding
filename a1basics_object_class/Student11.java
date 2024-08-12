class Student11 {

String name ="satvinder";
int rollNo = 2000234;
String mobile= "24250008";
float marks = 45.0f;

void read()
{
System.out.println("STUDENT IS STUDYING");
}
void showDetails()
{
System.out.println(name);
System.out.println(rollNo);
System.out.println(mobile);
System.out.println(marks);
}
public static void main (String hathi[])
{
Student11 s1 = new Student11();

s1.showDetails();
s1.read();/* is method ko define hamne showDEtails k upar kiya tha but 
call niche kiya the , aisa ham kar sakte hain */ 



}


}