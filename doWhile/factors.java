package doWhile;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        System.out.println("To find the factors of given numbers : ");
        System.out.print("\n Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factor = 0,i=1;
        System.out.print("The Factors are :  ");
        do{
                if(number % i == 0)
                {
                    factor = i;
                    System.out.print(factor + " ");
                }
                i++;
        }while(number!=0);
        sc.close();
    }
}
