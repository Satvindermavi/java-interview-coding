class checkConst9
{

checkConst9(int x , int y)

{
System.out.println( "ka name ");
System.out.println(x);
System.out.println(y);

}


public static void main(String hathi[])
{

checkConst9 obj = new checkConst9(1,2);
checkConst9 obj1 = new checkConst9(1,2);


// ek constructor ko ek object par ek hi baar call kar sakte hai
// lekin agar objects alag hain to ek constructor ko call kar sakte 
//hain
//wahi ek method ko ek object par baar baar kar sakt hain call
}
}