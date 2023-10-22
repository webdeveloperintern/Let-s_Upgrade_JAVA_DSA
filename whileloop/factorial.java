package whileloop;
/* Factorial */
import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        while(number != 0){
            factorial *= number ;
            number --;
        }
        System.out.println("The factorial for given number "+number+"! is : "+factorial);
        sc.close();
    }
}