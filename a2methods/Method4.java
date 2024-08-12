import java.util.Scanner;

class Method4
{

void char1 (char x , char y ,char z )
// yaha par hamne iske saath promise kar diya jab bhi ise 
//ham main k andar call karenge to isme ek character paas karenge 
{
System.out.println("The firts character you entered is : " +x);
System.out.println("The second character you entered is : " +y);
System.out.println("The third character you entered is : " +z);
}
public static void main(String hathi[])
{

Scanner ob = new Scanner(System.in);
   Method4 m4=new Method4();
 
System.out.println("Enter the first characteer");
char a = ob.next().charAt(0);


System.out.println("Enter the  second characteer");
char b = ob.next().charAt(0);


System.out.println("Enter the third character"); 
char c = ob.next().charAt(0);

m4.char1(a , b , c);
}
}
/*
int = nextInt();
float = nextFloat();
double= nextDouble();
String = next();// for single word 
String = nextLine();
character = next().charAt(0);
*/