class Hascode2
{
public String toString()
{
return getClass().getName() + '+' + Integer.toString(hashCode());
}
public static void main(String args[])
{
 Hascode2 hs = new Hascode2();
 System.out.println(hs);
}
}