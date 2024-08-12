/*

javac -d . Encapsulation1.java

java com.codersmavi.encapsulation1.Test

your email is :satvindersingh3812@gmail.com
your passsword is :mavi.mavi
*/

package com.codersmavi.encapsulation1;
public class Encapsulation1 implements java.io.Serializable
{
  String email,password;

void detail()
{
System.out.println("your email is :"+email);
System.out.println("your passsword is :"+password);

}

}

class Test
{

public static void main(String hathi[])
{
 Encapsulation1 obj = new Encapsulation1();
obj.email = "satvindersingh3812@gmail.com";
obj.password = "mavi.mavi";
obj.detail();


}
}