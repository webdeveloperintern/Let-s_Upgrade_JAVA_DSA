//String Count
import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string1 = sc.nextLine();
        char[] strin1 = string1.toCharArray();
        String string2 = "";
        int length = string1.length();
        for(int i=length-1; i>=0; i--){
            string2 += strin1[i];
            // System.out.print(string2);
        }
// System.out.println(string1.equals(string2));
        if(string1.equals(string2)){
            System.out.println("The given String "+string1+" is Pallindrome");
        }else{
            System.out.println("The given String "+string1+" is not Pallindrome");
        }
    }
}
