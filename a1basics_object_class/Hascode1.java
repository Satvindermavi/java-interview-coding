class Hascode1
{
public String toString()
{
return getClass().getName() + '@' + Integer.toString(hashCode());
}
public static void main(String args[])
{
 Hascode1 hs = new Hascode1();
 System.out.println(hs);
}
}