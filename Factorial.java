import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");

        int number = input.nextInt();
 	
        long factorial = 1;
 	
        for(int i = 1; i <= number; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        } 
        System.out.printf("Factorial of %d = %d", number, factorial);
    }
}