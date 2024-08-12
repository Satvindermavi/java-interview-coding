class Init2
{

int x;

/* is baar hamne apna constructor nahi banaya hence default waaala calll 
hua hoga */


{
x=20;
System.out.println("Init wala wala x:" +x);
}

public static void main(String args[])
{

Init2 obj = new Init2(); 
}
}