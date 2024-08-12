class StudentC5
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

StudentC5(float st,float et,int ns,String nc)

/*is constructor saath 
hamne
yaaha par waaada kar diya ki jab bhi issse call karenge to isme 
float float int 
String passs karenge */

{
startTime=st;
endTime=et;
numberOfStudent=ns;
nameOfClass=nc;
}

public static void main (String hathi[])
{
System.out.println("Details of first subject");
StudentC5 phe = new StudentC5(12.0f,12.30f,4,"Physical Education");
phe.showClassInfo();

System.out.println();
System.out.println("Details of second subject");
StudentC5 sci = new StudentC5(12.3f,1.0f,8,"science");
sci.showClassInfo();

/* 
yaha se ham ek aur chij conclude kar sakte hain ki constructor 
alag alag object par call hu hai ,lekin methods k case me bahut 
 saare methods ek hi object par call ho jaate the
*/
}
}