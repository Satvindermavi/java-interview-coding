class Chaining10
{

void Test()
{

System.out.println("Test wala chal gya");
}

void disp()
{
System.out.println("display wala chal gya");
}

void show()
{
System.out.println("show wal chal gya");
}

Chaining10() // Internaly Chaining10 Chaining10()
{
System.out.println("constructor chl gya");

//return this;
}

public static void main (String hathi[])
{

 new Chaining10().show(); // constr aur show dono chalenge 

//mere according internally return hua hua this yaha show me paas hhua hoga ,
// nhi aisa nahi hota 
// basically ab samjh me ayeya ki actual me kya hota hoga , actual me constructr
/* return karta hai  current object ka refrence in the form of this ,
hence new Chainin10().show() , jaise hi call hua hoga 
to ye method object refrence par call hua hoga , this.show(); aise kar k

jaise ham normlly karte a rhe the ab tak for e.g: obj.show();
*/ 
                                    
}
}