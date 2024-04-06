import java.util.Scanner;
public class Addition{

public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Access: ");
int number1 = input.nextInt();

System.out.print("Ego: ");
int number2 = input.nextInt();

int multiplication = number1 * number2;

System.out.printf("Multiplication is %d%n", multiplication);
   }
}