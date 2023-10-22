package Function.revurssion;

import java.util.Scanner;

public class GCD {
    public static int GCD(int a , int b){
        if(a == b) return a;
        else if(b>a){
            return GCD(b,b-a);
        }
        else return GCD(b, a-b);
    }
    public static void main(String[] args) {
        System.out.println("Enter the two Multipliers : ");
        System.out.print("Enter Multiplier-1 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("\n Enter the Multiplier-2 : ");
        int b = sc.nextInt();
        System.out.println("\n The GCD of the Numbers "+a+" , "+b+" = "+GCD(a,b));
    }
}
