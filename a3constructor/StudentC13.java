class StudentC13
{

StudentC13( ) 
{
System.out.println("this is a constructor");

}


public static void main(String hathi[])
{
StudentC13 obj1= new StudentC13();
/*
mat bhulo ki yaha par hame constructor ko call kiya hai
 niche likhe tarike se bhi call kar skate hain , lekin ek baar upar 
already call kar chuke hain ab dusri baar call ho jayega
*/


new StudentC13(); 

}
}