package Function.revurssion;

import java.util.Scanner;

public class sumoffactorial {
    public static int factorial(int n){
        int n1=0,n2=1,n3;
        int sum = n1+n2;
        System.out.print("\n"+n1+" "+n2+" ");
        if(n == 0 || n < 0 ) return 0;
        if(n < 2)
        {
            return sum;
        }
        else
        {
        while(n >= 0){
            n3=n2+n1;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
            sum += n3;
            n--;
        }
        return sum;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int number = sc.nextInt();
        System.out.println("\nThe sum is : "+factorial(number));
    }
}
