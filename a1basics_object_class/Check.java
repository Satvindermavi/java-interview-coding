class Check
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
new Check();
new Check().read();
new Check().studentInfo();
}

}


/*
Students are reading
0
null
null
*/