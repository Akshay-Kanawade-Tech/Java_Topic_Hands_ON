package exception_handling;

import java.util.Scanner;

/*Q.Write a Java program that throws an exception and catch it using a try-catch block.*/
public class ExceptionH1 {

    //main method

    public static int division(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Can not divide a number by zero!");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int dividend = sc.nextInt();

        System.out.println("enter divisor :");
        int divisor = sc.nextInt();

        //risky code inside try block and handling code inside catch block
        try {
            int result = division(dividend, divisor);
            System.out.println("result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
