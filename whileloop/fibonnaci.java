package whileloop;
/*Fibonacci Series */

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        System.out.println("ENter the number : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" , "+ n2+" ,");
        while(range != 0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 +" , ");
            range--;
        }
        sc.close();
    }
}