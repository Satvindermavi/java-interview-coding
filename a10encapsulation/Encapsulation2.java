


package com.codersmavi.encapsulation2;

public class Encapsulation2 implements java.io.Serializable
{
  private String email,password;
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
 Encapsulation2 obj = new Encapsulation2();
obj.email = "satvindersingh3812@gmail.com";
obj.password = "mavi.mavi";
obj.detail();
}
}
/*
 error: email has private access in Encapsulation2
obj.email = "satvindersingh3812@gmail.com";
   ^
Encapsulation2.java:34: error: password has private access in Encapsulation2
obj.password = "mavi.mavi";
*/