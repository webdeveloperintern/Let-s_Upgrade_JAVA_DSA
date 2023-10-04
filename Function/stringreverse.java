package Function;

import java.util.Scanner;

public class stringreverse {
    public static String strrev(String word){
        int length = word.length();
        String reverse = String.valueOf(length-1);
        return reverse;
    }
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String word = sc.nextLine();
        System.out.print("\nThe original word : "+word);
        System.out.print("\nThe reversed number is : "+strrev(word));
    }
}
