package doWhile;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(),reverse=0;
        int quotient = number;
        do{
            int reminder = quotient % 10;
            reverse = reverse * 10 + reminder;
            quotient /= 10;
        }while(quotient != 0);
        if(number == reverse) System.out.println("The given number "+number+" is a Pallindrome Number");
        else{
            System.out.println("The given number "+number+" is not a Pallindrome Number");
        }
        sc.close();
    }
}
