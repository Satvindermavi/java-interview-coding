class Student5
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
//
 second meethod of creating the object using the new keyword

 Student5 s1 = new Student5();
s1.rollNo=200280125;
s1.name="Satvinder SIngh  MAvi";
s1.mobileNo="0839232584462";
s1.studentInfo();
s1.read();
System.out.println(s1);//ye to refrence id print karane k liye likha hai
//akdwc abhi bhi agar mai niche wali line likhuga to error ayega:
System.out.println(rollNo); 
//error: non-static variable rollNo cannot be referenced from
// a static context System.out.println(rollNo);
}

}