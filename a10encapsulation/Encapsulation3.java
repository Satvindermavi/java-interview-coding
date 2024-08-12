
package com.codersmavi.encapsulation3;

public class Encapsulation3 implements java.io.Serializable
{
  private String email,password;

void setEmail(String email)
{
this.email= email;
}
void getEmail()
{
System.out.println("Your Email is"+email);
}
void getPassword()
{
System.out.println("Your Password is"+password);
}
void setPassword(String password)
{
this.password= password;
}
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
 Encapsulation3 obj = new Encapsulation3();
 obj.setEmail("satvindersingh3812@gmail.com");
 obj.setPassword("mavi.mavi");
 obj.getEmail();
 obj.getPassword();
 
}
}