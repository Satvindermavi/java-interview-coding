/*METHOD K ANDAR METHOD KO CALL TO KAR SAKTE HAIN LEKIN DEFINE 
NAHIN KAR SKATE*/
import java.util.Scanner;
class Method5 
{
void add(int x , int y)
{
int sum = x+y;
System.out.println("The sum of the integers is :"+sum);
minus(x,y);//METHOD K ANDR SEE MTHOD KO CALL KAR K DIKHAAya HAI
}

void minus (int a , int b)// waada kiya ki jab call karenge int denge
//yaha x aur y bhi likh saktee the wah x aur y upar wale se alag 
//honge mohit sir ne btaya tha kyuki method ka naam alg hai
{
int sub = a-b;
System.out.println("the subtraction is :"+sub);
}

public static void main(String hathi[])

{
Scanner obj = new Scanner(System.in);

System.out.println("enter the firts integr");

int c = obj.nextInt();//yaha par bhi x likh sakte , ye x alag hoga

System.out.println("enter the second integer");

int d = obj.nextInt();// yaha par bhi y likh sakte hai, ye y alag hoga

Method5 m5 = new Method5();
m5.add(c,d);

}
}

 