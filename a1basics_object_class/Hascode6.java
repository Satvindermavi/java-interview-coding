class Hascode6
{
public String toString()
{
return getClass().getName() + '+' + Integer.toString(hashCode());
}
public static void main(String args[])
{
 Hascode6 hs = new Hascode6();

 int integerHashValue = hs.hashCode();
// hashCode aapko ek integer value provide karta hai 

System.out.println(integerHashValue);//366712642


// INteger k class k andar ek method hota hai toHexString() naam ka ,
// is method me ham upar di hui value ko paas karte hai, and hence
// correspondingly ye hame ek strig value provide karta hai


String hexstr = Integer.toHexString(integerHashValue);

System.out.println(hexstr);// 15db9742;


/* kisi class k object par agar aaap getClass.().getName() method ko
chalayoge to aapko aapki class ka naam output me mil jayega */


String classKaName = hs.getClass().getName();

System.out.println(classKaName);


//ab ham refrence id ko print karnege

System.out.println(classKaName + '@' + hexstr);

System.out.println(classKaName + '%' + hexstr);



}
}