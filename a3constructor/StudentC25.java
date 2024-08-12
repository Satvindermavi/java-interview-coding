/*Ab hamara target hai ki jo obj1 me hai wahi obj2 me ho 
ye nahi hua tha  solve ab btata hu solve kyu nahi hua tha , ye solve
isliye nahi hua tha because , mai object ka refrence dusre object
me daal rha tha , aur jo approach follow kar rha tha wah thi , new se
jo second method hota hai object create karne lekin waise nahi hoga
hamein third approach lgani pari 
new StudentC25;
    
*/

 class StudentC25{
int age;
String name;

 StudentC25(int a, String s)
{
 age = a;
name = s;
}

StudentC25(Object x) 
{

}
void showDetail()

{
System.out.println("call karte waqt vale paaas kakri hence chal gya");
System.out.println(age);
System.out.println(name);
}

public static void main (String hathi[])

{
StudentC25 obj1 ;
obj1 =new StudentC25(200280125,"honey");
obj1.showDetail();

StudentC25  obj2;
obj2 = new StudentC25(obj1);//reference pass kiya
obj2.showDetail();
}


}