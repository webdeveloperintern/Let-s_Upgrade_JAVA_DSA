package whileloop;
/* Multiplier */
import java.util.Scanner;

public class multipiclation {
    public static void main(String[] args) {
        System.out.print("Enter the multiplier : ");
        Scanner sc = new Scanner(System.in);
        int multiplier = sc.nextInt(),i=1,result=1;
        while(i <= 10){
            result = i * multiplier;
            System.out.println(multiplier + " X "+i+" = "+result);
            i++;
        }  
       sc.close();
    }
    
}
