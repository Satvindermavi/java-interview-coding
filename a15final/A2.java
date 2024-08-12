class A 
{
 final void show ( )

{
 System.out.println(" final method ko override nahi kiya jaa sakta");
}
}

class B extends A 

{

 void show ()
{

}
}

/*

 error: show() in B cannot override show() in A
 void show ()
      ^
  overridden method is final
*/