class StudentC24
{

int age;
String name;

StudentC24(int a, String s)
{
age = a;
name = s;
}
void showDetail()
{
System.out.println("call karte waqt vale paaas kari hence chal gya");
System.out.println(age);
System.out.println(name);

}
public static void main (String hathi[])
{
StudentC24 obj1 = new StudentC24(200280125,"honey");
obj1.showDetail();
/*Ab ham constructor ko call karenge lekin usmse koi bhi valuae paas 
nahi karenge ,
Hence errror ayega kyuki constructor ko define krte waqt hamne usse
waada kiya tha ki jab usko call lagayi jayegi to isme ek int aur ek string
value ko paas kiya jayega, dusra note yah hai ki isme default value bhi 
set nahi hogi 
*/
StudentC24  obj2 = new StudentC24();
obj2.showDetail();
}
}
/*
ERROR
StudentC24.java:26: error: constructor StudentC24 in class
 StudentC24 cannot be applied to given types;
StudentC24  obj2 = new StudentC24();
                   ^
  required: int,String
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/