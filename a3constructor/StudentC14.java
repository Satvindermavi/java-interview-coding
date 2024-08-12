class StudentC14
{

StudentC14( ) 
{
System.out.println("this is a constructor");

}


public static void main(String hathi[])
{
StudentC14 obj1= new StudentC14();
/*
isse to call ho jayega
 mere according ab do baar print hona chahiye tha
obj1.StudentC14(); are yaar ye kaise bhool  gaye ki constructor 
ek object par ek hi baar call hota hai , agar dobara call kranahai
to ya to new StudentC14() likho ya fir 
kisi aur object pe call karo usko 

  error: cannot find symbol
obj1.StudentC14();
    ^
  symbol:   method StudentC14()
  location: variable obj1 of type StudentC14
1 error

hence iska matlab aap constructor ko oject pe call nahi ka sakte
*/


}
}