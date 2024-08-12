class A14 
{
void showData(I i)
{

}
public static void main(String hathi[])
{
 A14 obj = new A14();
 obj.showData(new B());

/* OR

B objD = new B();

obj.showData(objD); 

*/

 }
}

interface I
{


}

class B implements I
{

}