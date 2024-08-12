class This1
{

This1()
{
//har constructor pe implicitely this available hota hai
//usi ko ham yaha par print karwayege
//this basically current object ki refrence id ko hold rakhta hai
System.out.println(this);
}

void show()
{
System.out.println(this);
}

public static void main(String hathi[])
{
 This1 t1 = new This1();
 System.out.println(t1);
 t1.show();
 This1 t2 = new This1();
 System.out.println(t2);
 t2.show();

 
}
}
/*
t1 object ki refrence id soplyn se print karayi
same chij This1() aur show ne hold kar k rakhi thi 
This1@15db9742
This1@15db9742
This1@15db9742

t2 object ki refrence id soplyn se print karayi
same chij This1() aur show ne hold kar k rakhi thi

This1@6d06d69c
This1@6d06d69c
This1@6d06d69c

*/