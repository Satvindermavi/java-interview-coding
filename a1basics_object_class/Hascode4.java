class Hascode4
{
public String toString()
{
return getClass().getName() + '+' + Integer.toString(hashCode());
}
public static void main(String args[])
{
 Hascode4 hs = new Hascode4();

 int integerHashValue = hs.hashCode();
// hashCode aapko ek integer value provide karta hai 

System.out.println(integerHashValue);//366712642


// INteger k class k andar ek method hota hai toHexString() naam ka ,
// is method me ham upar di hui value ko paas karte hai, and hence
// correspondingly ye hame ek strig value provide karta hai


String hexstr = Integer.toHexString(integerHashValue);

System.out.println(hexstr);// 15db9742;




}
}