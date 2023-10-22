//String with no vowels
import java.util.Scanner;

class Main{
     static String remVowel(String str) 
    { 
         return str.replaceAll("[aeiouAEIOU]", ""); 
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String : ");
        String word = sc.nextLine();
        System.out.println("The Result is : "+remVowel(word)); 
    } 
}
