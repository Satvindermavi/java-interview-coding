class Method15
{
static String[] methodReturningArray()
{
 String [] a = {"Arjan Singh","Gurpreet Singh","Manprit Singh","Hukam Singh","Ravinder Singh"};

return a;

}

public static void main(String hathi[])
{

Method15 m15= new Method15();

String [] StoringArray = methodReturningArray();


// ab ham jo array values return hui hain unko print karenege 

for(int i=1; i<=5; i++)
{
System.out.println( StoringArray[i]);
}

}

}
//non paramaterized method returning String array