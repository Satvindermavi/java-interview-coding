class Method9
{

int sum()// return type without paramemters
{
int a=5;
int b=6;
int c= a+b;
return c;
}
public static void main(String hathi[])
{
Method9 m9= new Method9();
System.out.println("the return value is ="+m9.sum());

/*
isko aap aise bh likh sakte the
int d = sum();
System.out.println("the return value is ="+d);
lekin yah khamakha lamba prta
*/

}
}

//plus aise bhi likh sakte  the koi output nai ayega
//m9.sum();// jiase hi call hua hoga isko badle me c value return
// hui hogi

/* output is :
the return value is =11

*/