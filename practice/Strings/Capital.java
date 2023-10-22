//capital letter foe all word in string
import java.util.Scanner;

class Main{ 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String : ");
        String word = sc.nextLine();
        String[] subString = word.split(" ");
        for (int i=0;i<subString.length;i++ )
        {
            System.out.print(subString[i].substring(0,1).toUpperCase()+subString[i].substring(1)+" ");
        }
        
    } 
}
