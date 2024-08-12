class Method14
{
static int[] methodReturningArray()
{
 int [] a = {20,40,60,80,100,120};

return a;

}

public static void main(String hathi[])
{

Method14 m14= new Method14();

int [] StoringArray = methodReturningArray();
/* yaha par method ki
 calling kari hai , jaha par methhod call hota hai waha par wah value 
return hokar aaati hai . hence us return hui value ko ham yaha 
StoringArray naam k variable me hold karwa lenge
*/

// ab ham jo array values return hui hain unko print karenege 

for(int i=1; i<=5; i++)
{
System.out.println( StoringArray[i]);
}

}

}