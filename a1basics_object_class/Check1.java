class Check1
{
int rollNo =1;
String name="honey";
String mobileNo = "7599394895";

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
new Check1();
new Check1().read();
new Check1().studentInfo();
}

}


/*
Students are reading
0
null
null
*/