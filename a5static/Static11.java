class Static11
{
 public static void main(int x)
{
  System.out.println("user wala pehla main chala");
}


public static void main(String args[])
{

System.out.println("CONTRACT wala main chala");
Static11.main(89);// standard approCH TO CALL STATIC METHOD
Static11.main();

 }

 public static void main()
{
  System.out.println("user wala doosra main chala");
}



}

/* main koi keyword nahi hai ,ye just ek identifier hai, hence isi 
naam kaa method ham aur bhi create kar sakte hain khud*/