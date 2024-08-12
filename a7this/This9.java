class This9
{
 String name;
 int salary;

 void test(String name , int salary)
{
name = name;
salary = salary;
}
void showDetail()
{
System.out.println(name);
System.out.println(salary);

}
public static void main(String args[])
{
This9 t = new This9();
t.test("satvinder",200280125);
t.showDetail();
}

}
/*
null i was expecting satvinder 
0 i was expecting 200280125
confusion create ho gayi upar 
name = name;
salary = salry ; 
hence jo bahar name and salary likha hai usko specify karane k 

*/