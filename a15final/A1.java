 
final class A 
{
   
    
}  
   
class B extends A  
{
    public static void main (String args[]) 
    {

   System.out.println("final class ko inherit nahi karr sakte");

    }
}
 
 /*
 error: cannot inherit from final A
class B extends A
                ^
 */