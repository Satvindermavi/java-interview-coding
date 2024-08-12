class A{

void m1()
{
System.out.println("m1");
}

boolean m2()
{
System.out.println("m2");
return true;
}

char m3()
{
System.out.println("m3");
return 'a';
}

String m4()
{
System.out.println("m4");
return "hello";
}

float m5(float x)
{
System.out.println("m5");
return 545.6f;
}


double m5()
{
System.out.println("m5");
return 34.5;
}

int m6()
{
System.out.println("m6");
return 0;
}

void  m7(int x)
{
System.out.println("m7");
}


void  m8(boolean x,String s)
{
System.out.println("m8");
}

void  m9(String x,String s,float f)
{
System.out.println("m9");
}


char  m9(char c)
{
System.out.println("m9");
return 's';
}



public static void main(String hathi[])
{
A a = new A();
a.m1();

boolean b = a.m2();
System.out.println(b);

char c = a.m3();
System.out.println(c);

String d =a.m4();
System.out.println(d);

float e =a.m5(56.7f);

double h=a.m5();
System.out.println(h);

System.out.println(e);

int f=a.m6();
System.out.println(f);

a.m7(45);
a.m8(true,"satvinder singh");
a.m9("sachin","raina",56.7f);
char g=a.m9('f');
System.out.println(g);
}
}


/* output:
m1
m2
true
m3
a
m4
hello
m5
m5
34.5
545.6
m6
0
m7
m8
m9
m9
s
*/