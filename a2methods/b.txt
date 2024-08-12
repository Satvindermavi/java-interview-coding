class Method21
{


static void Mavi(int ...i) // using varg arg 
{
System.out.println("mavi Coders");
}

public static void main (String hathi[])

{

System.out.println("Method ko bina argument pass kiye call karenge ");

System.out.println("Also aage parenge ham main ko khu bhi call kar skte hain");


Mavi(); 

Mavi(45); // ispe bhi call ho jayega

Mavi (23,45); // ispe bhi 

/*

par note karne waali waat yah hai ki , jo chij aap aisa an argument 

paas karoge usme data type same hona chahiye , hamre case me yaha keval


int type ka hona chahyie


*/




}

}