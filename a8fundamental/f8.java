class f8
{

public static void main(String hathi[])
{
float a = true;
float b = "true";
float c = True;
float d = 45.7;
float e = new f8();

}
}
/*
error: incompatible types: boolean cannot be converted to float
float a = true;
          ^
f8.java:7: error: incompatible types: String cannot be converted to float
float b = "true";
          ^
f8.java:8: error: cannot find symbol
float c = True;
          ^
  symbol:   variable True
  location: class f8
f8.java:9: error: incompatible types: possible lossy conversion from double to float
float d = 45.7;
          ^
f8.java:10: error: incompatible types: f8 cannot be converted to float
float e = new f8();
          ^
5 errors

 
*/