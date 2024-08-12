class StudentC2
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
StudentC2 s1 = new StudentC2();

s1.setClassInfo(12.0f,12.30f,4,"Physics");
System.out.println("Marks of physical education")
s1.showClassInfo();



}
}