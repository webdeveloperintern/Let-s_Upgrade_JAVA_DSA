//Pattern
import java.util.Scanner;
import java.util.regex.*;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(word);
        boolean result = matcher.find();
        
        if(result){
            System.out.println("The given string Contains only numbers");
        }else{ 
            System.out.println("The given string Contains alphanumeric/special Characters included");
        }

    }
}
