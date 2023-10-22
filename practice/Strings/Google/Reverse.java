// Reverse a String
import java.util.Scanner;

class Reverse{
    public static void main (String[] args) {
        System.out.print("Enter the String  : ");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        char[] Original = original.toCharArray();       
        int Length = original.length();
        String Reversed = "";
        // System.out.println(Length);
        for (int i = Length-1; i >= 0 ; i--){
            // System.out.println(Original[i]);
            Reversed += Original[i];
        }
        System.out.print("The Reversed String is : "+Reversed);
        
    }
}
