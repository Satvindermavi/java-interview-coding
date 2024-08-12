class Method11
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

/*
basically scanerio kuch is parkaar hai ki pehlee object create hua , or in 
other words we can say that class k instance variables ko memory me 
jaakr
jagah mili
And
and un variables ko hamne initialize kiya baad me (matlab after the 
creation of the object
*/

public static void main (String hathi[])
{
Method11 s1 = new Method11();// object create kia

s1.setClassInfo(12.0f,12.30f,4,"Physics");// aise likhne se values
// store  
// ho gayi memory me jaakr or we can say ki yahi values jaakr showinfo waale me set ho gayin
System.out.println("About Batch 1");
s1.showClassInfo();

s1.setClassInfo(1.0f,1.30f,5,"Chemistry");
System.out.println("About Batch 2");
s1.showClassInfo();



}
}