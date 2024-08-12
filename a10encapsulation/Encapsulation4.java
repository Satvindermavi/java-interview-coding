package com.codersmavi.encapsulation4;

public class Encapsulation4 implements java.io.Serializable
{
  private String email,password;
void setEmail(String email)
{
this.email= email;
}
String getEmail()
{
return email;
}
void setPassword(String password)
{
this.password= password;
}
String getPassword()
{
return password;
}
}
class Test
{
public static void main(String hathi[])
{
 Encapsulation4 obj = new Encapsulation4();
 obj.setEmail("satvindersingh3812@gmail.com");
 obj.setPassword("mavi.mavi");
 String e = obj.getEmail();
System.out.println(e);
 String p= obj.getPassword();
System.out.println(p);
System.out.println("or we can also get the value like :");
System.out.println(obj.getEmail());
System.out.println(obj.getPassword());
}
}
