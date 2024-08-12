class StudentC3
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

void setClassInfo(float st,float et,int ns,String nc)
{
startTime=st;
endTime=et;
numberOfStudent=ns;
nameOfClass=nc;
}


public static void main (String hathi[])
{
StudentC2 s1 = new StudentC2(12.0f,12.30f,4,"Physics");

/*isme error ayega , jav object create ho rha hota hai to aap usmi samay
 values paas nahi kar sakte. 
lekin ham chah yahi rahe the ki jab oject create ho to thik usi samay
 values jaakar assign ho jaye*/

s1.setClassInfo();
s1.showClassInfo();



}
}