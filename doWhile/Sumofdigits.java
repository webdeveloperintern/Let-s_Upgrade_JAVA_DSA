package doWhile;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.print("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(),sum=0;
        do{
            int reminder = number % 10;
            sum += reminder;
            number /=10;
        }while(number !=0);
        System.out.println("Sum of the digits = "+sum);
    }
}
