
/*hamara objective hai ki class k andar jitne students parh rahe
 hain unke
baare me apne info provide karnni hai ki unki class ki timing kb 
start 
hoti hai , kab end hoti hai and kitne students hain us batch me , also
 hamne ye bhi btana hai bo konse subjet ki class hai */

class Method10//class ka naam BatchInfo jaada sense banata
{
// ye program waise hi hai ankhe kholne k liye
float startTime;
float endTime;
int numberOfStudent;
String nameOfClass;


void showClassInfo()
{
System.out.println("startTime ="+startTime);
System.out.println("endTime ="+endTime);
System.out.println("numberOfStudent ="+numberOfStudent);
System.out.println("nameOfClass ="+nameOfClass);
}

/*
basically scanerio kuch is parkaar hai ki pehlee object create hua , 
or in 
other words we can say that class k instance variables ko memory me
 jaakr
jagah mili
And
and un variables ko hamne initialize kiya baad me (matlab after the 
creation of the object

means , jab tak object create nahi hoga tab tak value ko initiaze
nahi kra sakte 

*/

public static void main (String hathi[])
{
System.out.println("About Batch 1");

Method10 B1= new Method10();
B1.startTime=12.0f;//aisa likhne se start time jaakar set ho gya
B1.endTime=12.30f;//aisa likhne se end time jaakr likha gya memory me
B1.numberOfStudent=4;//similarly ye bhi
B1.nameOfClass="Physical Education";//similarly ye bhi
B1.showClassInfo();

System.out.println();// ye space k liye kiya hai
System.out.println("About Batch 2");

Method10 B2= new Method10();
B2.startTime=12.0f;
B2.endTime=12.30f;
B2.numberOfStudent=4;
B2.nameOfClass="Science";

B2.showClassInfo();

}
}