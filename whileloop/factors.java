package whileloop;
/*Factors of numbers*/

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int i=1,factor=0;
        System.out.println("The factors are : ");
        while(i<=Number){
                if(Number % i == 0)
                {
                    factor = i;
                    System.out.print(factor+" , ");
                }
            i++;
        }
        sc.close();
    }
}