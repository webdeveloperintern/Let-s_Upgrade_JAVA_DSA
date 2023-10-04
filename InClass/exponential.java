package InClass;

import java.util.Scanner;

public class exponential {

    public static double findexponent(double base,int exponent){
        if(exponent > 0)
        {
            
            return base*findexponent(base, exponent-1);
        }
        else if(exponent < 0){
           
            return  findexponent(base, exponent+1)/base;
        }
        else
        return 1;
    }

    // public static double findexponentwp(double base, int exponent)
    // {
    //     if(exponent ==0 ) return 1;
    //     if(exponent > 0)
    //     {
    //         for(int i=1;)
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        double base = sc.nextInt();
        System.out.print("Enter the exponent value : ");
        int exponent = sc.nextInt();

        System.out.println("The Solution is : "+findexponent(base,exponent));
        // System.out.println("The Solution is : (Without Power Function)"+findexponentwp(base,exponent));
    }
}
