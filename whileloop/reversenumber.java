/*reverse number */
package whileloop;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc  =  new Scanner  (System.in);
        int Number  =  sc.nextInt(),reverse=0;
        System.out.println("The original number is : "+Number);
        while(Number != 0 ){
            int temp = Number % 10;
            reverse = reverse*10 + temp;
            Number /=10;
        }
        System.out.println("The reverse Number is : "+reverse);
        sc.close();
    }
}