package doWhile;

import java.util.Scanner;

public class multiplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Multipication : ");
        System.out.print("Enter the Multiplier : ");
        Scanner sc = new Scanner(System.in);
        int Multiplier = sc.nextInt();
        int i=1,result=1;
        do{
            result = i * Multiplier;
            System.out.println(Multiplier+" X "+ i+" = "+result);
            i++;
        }while(i <= 10);
        sc.close();
    }
}
