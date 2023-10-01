package whileloop;
/* Pallindrome Number */

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number,rev=0;
        while(number != 0){
            int reverse = number % 10;
            rev = rev * 10 + reverse;
            number = number / 10;
        }       
        if(temp == rev)
        {
            System.out.println("The number is pallindrome");
        }  
        else
        {
            System.out.println("The number is not a pallindrome");
        }
        sc.close();
    }
}