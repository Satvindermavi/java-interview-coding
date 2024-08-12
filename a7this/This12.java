
/* this always holds refrence id of the current object */

class This12 
{

void show()
{

System.out.println(this);
}

This12()
{

System.out.println(this);

}

public static void main (String hathi[])
{

This12 t =  new This12();
t.show();

This12 t1 = new This12();
t1.show();

}


}