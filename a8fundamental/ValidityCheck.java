import java.util.Scanner;

class ValidityCheck
 {
    String name = "Satvinder Singh";
    int password = 7890;

    void login() 
{
   if (name.equals("Satvinder Singh") && password == 7890)
 {
   System.out.println("Valid User");
  } 
else {
            System.out.println("Invalid User");
        }
}

    public static void main(String hathi[])
 {
    ValidityCheck obj = new ValidityCheck();

    Scanner scanner = new Scanner(System.in);

        System.out.println("Dear user, please write your name: ");

        String userName = scanner.nextLine();

        System.out.println("Dear user, please write your password: ");

        int userPassword = scanner.nextInt();

        obj.name = userName;

        obj.password = userPassword;

        obj.login();
        
}
}
