class a7 // StudentDetail

{
int rollNo =200280125;
String name = "Satvinder Singh Mavi";

void showDetails()
{
System.out.println(rollNo);
System.out.println(name);
}


public static void main (String args[])
{

// dono objects ki alag alag refrence id print hogi


System.out.println(new a7());//a7@15db9742

// new a7(),itna likhte hi memory me object create hoga

System.out.println(new a7());//a7@6d06d69c

//new a7(),itna likhte hi memory me ek aur object create hoga

//hence ek chij to clear hai ki ham annonymous object ko reuse nahhi
//kar sakte
/* inme bina wajah se memory waste  hotii hai unnessecaarily*/
}
}
/*
Output:
a7@15db9742
a7@6d06d69c

*/