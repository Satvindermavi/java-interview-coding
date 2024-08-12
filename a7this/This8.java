class This8
{
 String name;// instANCE WAALO KA TO initialisation hua hi nahi
 int salary;

 void showDetail(String name , int salary)
{
System.out.println(name); // yaha par local wale maankar value print hogi
System.out.println(salary);
}

public static void main(String args[])
{
This8 t = new This8();
t.showDetail("satvinder", 650000);
System.out.println(t.name);
System.out.println(t.salary);

}

}
/*
output:
satvinder
650000
null
0
*/