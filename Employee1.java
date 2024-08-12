class Static1
{

String studentName; // instance / class variable / non static 

float package; // instance / class variable / non static

static String companyName; static 

static String collegeName; // static 


Static1(String sn , float p , String cmp , String clg)
{
   studentName =sn;
  package = p;
  companyName = cmp;
 collegeName = clg;
}


void showDetails()
{
System.out.println(studentName);
System.out.println(companyName);
System.out.println(package);
System.out.println(collegeName);
}

public static void main (String args[])
{
 Static1 obj = new Static1("satvinder","google",560000,"GZS");

 Static1 obj1 = new Static1("saurav","google",2345566,"GZs") ; 
}

}