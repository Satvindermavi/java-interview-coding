// Taking integer input in java 

import java.util.Scanner;

public class a1{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);

    // takiing integer input

    System.out.println("Enter your  first lucky number");

    int num_1= sc.nextInt();

    System.out.println("Your lucky number is : " + num_1);

    System.out.println("Enter your second lucky number");

    int num_2 = sc.nextInt();

    System.out.println("Your  second lucky number is : " + num_2);


    System.out.println("the sum of " +num_1+ "and" +num_2+ "is" + (num_1 + num_2));
    //the sum of 34 and 56 is 90

    System.out.println("the sum of " +num_1+ "and" +num_2+ "is" + num_1 + num_2);
    //the sum of 34 and 56 is 3456

    }
}