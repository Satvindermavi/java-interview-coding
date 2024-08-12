class Student4
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
/*System.out.println(new Student4());
System.out.println(new Student4().name="Satvider Mavi");
System.out.println(new Student4().mobileNo="72368272");
System.out.println(new Student4().rollNo=200280125;

// ham isme stuentinfo ko call to karrenge call ho bhi jayega lekin 
 usmee value asssign nahi hui  hogi and hence i guess isme default value
initialize hui hogi
new Student4().studentInfo();*/

/*
new Student4();
new Student4().name="Satvider Mavi";
new Student4().mobileNo="72368272";
new Student4().studentInfo();// isme values assign nahi hui hongi.
new Student4().read();
 */

new Student4().name="satvinder";
new Student4().rollNo=45;
new Student4().mobileNo="827288";
/*System.out.println(name);//non static can not be refrenced from static
System.out.println(rollNo);
System.out.println(mobileNo);
*/
/*new Student4().name;
aise karna chahoge tab bhi error ayega

 error: not a statement
new Student4().name;

*/
new Student4().read();
new Student4().studentInfo();//isme values abhi bhi ni asssign huin


}

}