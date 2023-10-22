package doWhile;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the rage of numbers : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+"  "+n2+"  ");
        do
        {
            n3=n2+n1;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
            range--;

        }while(range >= 0);
        sc.close();
    }
}
