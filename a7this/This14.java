/* Fourth usse of this keyword 

   It can be used to call the methodd also.
static  ALSO
*/



class This14
{

void show (){

System.out.println("obj ki help se show call hua");


this.display();

// display(); aise simply to call ho hi jayeegaa already malum hai
}

void display()
{


System.out.println("this ki help se display call hoga");
}



public static void main (String args[])
{

This14 obj = new This14();

obj.show();

//this.show(); 

/*
how could i forget that this ko ham static me use nahi kr sakte 
*/

}

}