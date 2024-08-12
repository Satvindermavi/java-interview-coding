class Static1// placement naam jaada acha rehtaa
{
  String studentName;
  String companyName; 
  float pack;
  String collegeName;

 void showDetails()
 {

 System.out.println(studentName);
 System.out.println(companyName);
 System.out.println(pack);
 System.out.println(collegeName);

  } 
// isko init se banakar dekhna
Static1(String s, String cmp, float p, String clg)
{
 studentName =s;
 companyName =cmp;
 pack = p;
 collegeName = clg;
 
}
 public static void main (String hath[])

{
 Static1 obj = new Static1("satvinder","pieinfocom",6.5f,"GZS");
 obj.showDetails();
 Static1 obj1 = new Static1("sashant","pieinfocom",6.5f,"GZS");
 obj1.showDetails();
 Static1 obj2 = new Static1("ranjan","pieinfocom",6.5f,"GZS");
 obj2.showDetails();
 


}
}