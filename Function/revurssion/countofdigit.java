package Function.revurssion;

import java.util.Scanner;


public class countofdigit {
    public static int Sumofdigits(int n,int digit){
        
        if(n<10) return ++digit;
        else{
            int reminder = n % 10;
            digit++;
            return Sumofdigits(n/10,digit);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit =0;
        System.out.println("The no digits in the given number "+number+" is :"+Sumofdigits(number,digit));
        sc.close();
    }
}
