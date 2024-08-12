/*1.
agar return type koi dusri class hai, then ham usme return kaise karwayeneg ,

also hamne us returned value ko hold karwakar print karwana hai 

*/

class A3
{

 A50 showData()
   {
System.out.println("mavi");

// return new A50();

// or 


A50 objB = new A50(); 
// agar ye statement hamne psvm me likhi hoti to cannot find 

return objB; 
}

public static void main(String hathi[])
{
A3 obj = new A3();
obj.showData();

System.out.println(obj);
obj = obj.showData();

System.out.println(obj);
}
}

class A50
{

}

