class Method6 
{
boolean money(String name , int pin) //return type with parameters
{
if (name=="honey"&&pin==5434)
return true;
else
return false;
}
public static void main(String hathi[])
{
Method6 m6 = new Method6();
/*m6.money("honey",5434); is-se khali jaakr store hota ,
 print nahi hoga
m6.money(); aise call karna parega print k liye and upar messge dena 
parega
*/
System.out.println(m6.money("honey",5434));//true ayega return hokar
System.out.println(m6.money("honey",5321));// false ayega return hokar
}
}