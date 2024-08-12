class Student6
{
int rollNo;
String name;
String mobileNo;

 void read()
{
System.out.println("Students are reading");
}
 void studentInfo()
{
System.out.println(rollNo);
System.out.println(name);
System.out.println(mobileNo);
}

public static void main(String args [])
{
 Student6 s1 = new Student6();
System.out.println("The details of the first student are a follows:");
s1.rollNo=200280125;
s1.name="Satvinder SIngh  MAvi";
s1.mobileNo="0839232584462";
s1.studentInfo();
s1.read();

/*

System.out.println(rollNo);
 non-static variable rollNo cannot be referenced from a static context
System.out.println(rollNo);

*/
                   ^

Student6 s2 =new Student6();
System.out.println("The details of the second student are a follows:");
s2.rollNo=200280145;
s2.name="Manjinder SIngh  MAvi";
s2.mobileNo="0883784462";
s2.studentInfo();
}

}