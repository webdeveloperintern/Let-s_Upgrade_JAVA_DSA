package doWhile;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(),reverse=0;
        System.out.print("Original / Given Number : "+ number);
        do{
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }while(number != 0);
        System.out.println("\nThe number reversed : " + reverse);
        sc.close();
    }
}
