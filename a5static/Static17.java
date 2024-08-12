class Static17
{
/* is baar ham java Static16  classs 16 k0 taam jhaam 
kar k classsoading me link karnege hence is baar iska data bhi load hoga 
*/ 
static
{
System.out.println("static17 is loading ");
}

public static void main(String args[])

 {
 
  }

}

class ClassLoading
{
 static
 {
 Static17 obj = new Static17();
 System.out.println("ClassLoading is loading ");
  }

 public static void main(String args[])

 {
   
  }

}