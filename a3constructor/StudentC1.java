
/*hamara objective hai ki class k andar jitne students parh rahe hain unke
baare me apne info provide karnni hai ki unki class ki timing kb start 
hoti hai , kab end hoti hai and kitne students hain us batch me , also
 hamne ye bhi btana hai bo konse subjet ki class hai */
class StudentC1//class ka naam BatchInfo jaada sense banata
{

float startTime;
float endTime;
int numberOfStudent;
String nameOfClass;


void showClassInfo()
{
System.out.println("startTime"+startTime);
System.out.println("endTime"+endTime);
System.out.println("numberOfStudent"+numberOfStudent);
System.out.println("nameOfClass"+nameOfClass);
}


public static void main (String hathi[])
{
System.out.println("About Batch 1");

StudentC1 B1= new StudentC1();
B1.startTime=12.0f;
B1.endTime=12.30f;
B1.numberOfStudent=4;
B1.nameOfClass="Physical Education";
B1.showClassInfo();

System.out.println();
System.out.println("About Batch 2");

StudentC1 B2= new StudentC1();
B2.startTime=12.0f;
B2.endTime=12.30f;
B2.numberOfStudent=4;
B2.nameOfClass="Science";
B2.showClassInfo();

}
}