class Hascode3
{
public String toString()
{
return getClass().getName() + '+' + Integer.toString(hashCode());
}
public static void main(String args[])
{
 Hascode3 hs = new Hascode3();
 int integerHashValue = hs.hashCode();
System.out.println(integerHashValue);
}
}