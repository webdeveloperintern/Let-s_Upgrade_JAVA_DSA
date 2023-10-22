//String with no repeating chars
import java.util.Scanner;

class Main{
     static String removedublicate(String str) 
    { 
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                  str = str.replace(String.valueOf(str.charAt(i)),"");
                }
            }
        }
        return str;
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String : ");
        String word = sc.nextLine();
        System.out.println("The Result is : "+removedublicate(word)); 
    } 
}
