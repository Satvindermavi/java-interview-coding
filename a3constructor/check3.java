class check3
{
/*method nam same hai  par parameter alg al type k hain*/
 void sum(int x, int y) 
{
System.out.println("method 1 ka name : sum,lekin parameter int");
System.out.println(x);
System.out.println(y);

}
void sum( float x , float y)
{
System.out.println("method 2 ka name bhi : sum , lekin prameter flot");
System.out.println(x);
System.out.println(y);
}

public static void main(String hathi[])
{
check3  obj = new check3();
obj.sum( 1,2);
obj.sum(3.4f,5.7f);


}
}