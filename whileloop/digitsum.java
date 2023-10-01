package whileloop;

import java.util.Scanner;

public class digitsum{
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0,sum=0;
        while(number != 0){
            reverse = number % 10;
            sum += reverse;
            number = number / 10;
        }
        System.out.println("Sum of the DIgits is : "+sum);
        sc.close();
    }
}