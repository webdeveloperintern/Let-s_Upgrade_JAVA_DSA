// Reverse a String
import java.util.Scanner;

class Reverse{
    public static void main (String[] args) {
        System.out.print("Enter the String  : ");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        char[] Original = original.toCharArray();       
        int Length = original.length();
        char[] reversed = new char[Length];
        // System.out.println(Length);
        int j=0;
        for (int i = Length-1; i >= 0 ; i--){
            // System.out.println(Original[i]);
            reversed[j] = Original[i];
            j++;
        }
        String Reversed = "";
        for (int i = 0; i < reversed.length; i++){
            // System.out.println(reversed[i]);
            Reversed += reversed[i];
        }
        System.out.println("The Reversed String is : "+Reversed);
        
    }
}
