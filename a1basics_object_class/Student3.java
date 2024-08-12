class Student3
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

/*new Student3().name="Satvinder"; 
read();
studentInfo();
aisa likh kar data assig karwana chah rha tha lekin commpile time
 par error a gaya
*/


System.out.println(new Student3());

 new Student3().name="satvinder"; // isse sirf value assign hui
//System.out.println(name); non - static ko directly call nhi kr skte
///aisa likha lekin fir se error a gaya tha

System.out.println(new Student3().name="Satvider Mavi");
//non-static hain islye , soplyn me print krana parha
System.out.println(new Student3().mobileNo="77281");
System.out.println(new Student3().rollNo=200280125);
new Student3().read();

/*mujhe aisa laga tha ki upar name,mobileNO,rollNO asssign ho gya tha 
hence
ab jav ab dobara studentInfo() naam k method ko call karenge to ye sab values
print kar dega , lekin aisa nahi hua , hence ham keh sakte hai ki
 anonymous
object ko ham reuse nahi kar skte,hence hamein iski jagah par 
o.nullnull
receive hoga.

iska matlab jab bhi ham anonymouss object create karte hain to 
 jitni waar create karenge utni waar alag se memory create hogi
and nayi memory me values copy nahi hongi
*/

new Student3().studentInfo();

}

}
/*
output:
Student3@15db9742
Satvider Mavi
77281
200280125
Students are reading
0
null
null
*/