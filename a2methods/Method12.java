class Method12
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
Method12 s1 = new Method12(12.0f,12.30f,4,"Physics");

/*isme error ayega , jav object create ho rha hota hai to aap usi samay
 values paas nahi kar sakte using the concepts of method(m.f)*/
// isi chij ko aap constructor ki help se kar sakte ho

// hence for doing so we will   move on to the constructtor

s1.setClassInfo();
s1.showClassInfo();



}
}