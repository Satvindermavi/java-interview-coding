/*
now the question arises ki ham data ko access public se kar paa rhe hain , hame aisa karne ki\
jarurart  kyu parhi, ham directly bhi to aaccess kar skte the , aur public setter getter ki help
se bhi kar liya. to isse fayda hi kya hua , iss fayde yeh hua ki , jab user run time par 
apna password ya email bhejejga 
to usko validate kar liya jayega , uske format ko validate kar liyia jayega.
galt  value ya format acceptable nahi hoga
*/ 
package com.codersmavi.encapsulation5;
public class Encapsulation5 implements java.io.Serializable
{
  private String email,password;
   private int amount;
void setAmount(int amount)
{
if(amount<0)
throw new RuntimeException("invalid input");
else
this.amount=amount;
}

int getAmount()
{
return amount;
}


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
 Encapsulation5 obj = new Encapsulation5();
 obj.setEmail("satvindersingh3812@gmail.com");
 obj.setPassword("mavi.mavi");
 obj.setAmount(56);
 System.out.println(obj.getEmail());
 System.out.println(obj.getPassword());
 System.out.println(obj.getAmount());
}
}