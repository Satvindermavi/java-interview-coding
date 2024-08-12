class StudentC23
{

int age;
String name;

/*is construtor k saath hamne ye waada kr
diya ki jab bhi ise call karenge to isme ,ek int aur ek string value
ko paasa kar diya jaye*/


StudentC23(int a, String s){
age = a;
name = s;
}
void showDetail()
{
System.out.println("call karte waqt value paaas kari hence chal gya");
System.out.println(age);
System.out.println(name);

}
public static void main (String hathi[])
{
StudentC23 obj = new StudentC23(200280125,"honey");//waada nibhaya
obj.showDetail();
}
}
