class Method17
{

static int[] Numbers(int passedArray[])

/* iske saath vaaada kar diya ki jab bhi is method
 ko call karenge to isme ham integer array pass karenge */

{
int acceptingArray[] = new int[5];
 for (int i =0;i<=4;i++)
{

 /*int acceptingArray[i] =passedArray[i];
aisa likh rha tha to eror a gya , you can not declare and initialize
the array element withhin the loop like this */

 acceptingArray[i] = passedArray[i];
 //System.out.println(acceptingArray[i]);

}
return acceptingArray;

}

public static void main(String hathi[])
{
 int numbers[] = {20,40,23,44,21};
 Numbers(numbers);//aisa likha value return to hui par print nahi
}
}