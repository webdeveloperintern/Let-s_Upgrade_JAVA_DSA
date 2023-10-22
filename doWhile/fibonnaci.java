package doWhile;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        System.out.println("The Fibonnaci Series : ");
        System.out.print("Series for the given range : ");
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        do{
            n3 = n2+n1;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
            Range--;
        }while(Range != 0);
        sc.close();
    }
}
