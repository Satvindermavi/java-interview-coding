class Student2
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
new Student2();// iski id print nahi karwayi
//aisa likhne se khaali object create hua hai  
System.out.println(new Student2());//Student2@15db9742 iski kra li refID print
System.out.println(new Student2());//Student2@6d06d69c iski bhi krali




new Student2().read(); 

new Student2().studentInfo(); // mere according inki default value print hongi

// java me garbage value naam kaa koi conceept nhi hai 

//and agar values dee hotin to wah bhi store ho gayi hotin.

/*Student2.java:22: error: cannot find symbol
Student2().read();
^*/

//jo chij isse malum na ho ya valid na ho use 
//yah as a variable treat kar lega and aisa variable hamnne define nahi
// kiya hoga and hencce cannot find th symbol wala errror ayga
//Student2().studentinfo(); yaha par bhi cannot find wala errror
}

}

