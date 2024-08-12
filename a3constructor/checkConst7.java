class checkConst7
{

checkConst7(int x , int y)
// errror ayega hane iskse saath yah waada to kr dia ki jab iski 
// calling hogi to ha se do integer as a argument paaass karenge
// lekin aisa hamne nahi kiya hence hameiin error milega 
{
System.out.println( "ka name ");
System.out.println(x);
System.out.println(y);

}


public static void main(String hathi[])
{
//checkConst7 obj = new checkConst7();
//obj.checkConst7( 1,2);// ye likhne ki jrurat nahi thi

//HENCE HAMEIN YE LIKHNA CHAHIYE THA
checkConst7 obj = new checkConst7(1,2);




}
}