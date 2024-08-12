class StudentC4
{

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
// yaha par aapne constructorr create kiya
// It is a special type of the method , whose name is same as the
// classname and it does not have any return type even not void

StudentC4(float st,float et,int ns,String nc)//CONSTRUCTOR
{
startTime=st;
endTime=et;
numberOfStudent=ns;
nameOfClass=nc;
}

public static void main (String hathi[])
{
/*constructor bannee se fayda yah hua ki object bante hi data 
initialise
 ho gya
*/
StudentC4 s1 = new StudentC4(12.0f,12.30f,4,"Physics");

/*isme error  nahi ayega , jav object create ho rha hota hai to aap
 usmi samayvalues paas  kar sakte. ho */ 
//s1.StudentC4();mai pehle isko lijjh rha tha ye nahi likhna tha
s1.showClassInfo();
}
}