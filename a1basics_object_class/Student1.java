class Student1 //hamara objective hai students ki detail lena
{
int rollNo =5;
String name= "Satvider Singh";
String mobileNo= "Malwayi";
/* ye jo variables hain ye non-static hain(instance) , inko memory
tabhi milti hai jab object create hota hai
 */

void read()
{
System.out.println("Students are reading");
}
void studentInfo()
{
System.out.println("roolnumber:"+rollNo);
System.out.println("Name:"+name);
System.out.println("mobbile number:"+mobileNo);
}

public static void main(String args[])
{
read();
studentInfo();
}

}
/*
Student1.java:20: error: non-static method read() cannot be referenced
 from a static context
read();
^
Student1.java:21: error: non-static method studentInfo() cannot be 
sreferenced from a static context
studentInfo();
^
2 errors
*/