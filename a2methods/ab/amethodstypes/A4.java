/* 
qye : 
class A4 
{
void  m11(B b)
{
System.out.println("m11");
}

}

 */

// Solution:

class B
{



}

class A4 {

 void  m11(B b)
     //yaha hamne ye wada kiya ki isme classs B type ka parametter paas karenge 

      /* matlab jab m11 ko call kiya jayega to isme class B
       ka instance as an argument paas kiya jayega */

{
System.out.println("m11");
}

public static void main(String hathi[])
{
 B b = new B(); // B classs ka instance A4 class me create kiya

 A4 objA = new A4();// a4 class ka instaance create kiya

 objA.m11(b);
//Calng m11 method of A4 and pasing b as a argument(classs B type ka parameter pas kiya

// OR

objA.m11(new B()); // class b ka object passs kar diya


}
}





