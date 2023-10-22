//String Count
import java.util.Scanner;

class StringCharCount{
    public static void main (String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String InputString = sc.nextLine();
        int Count =0;
        for(char ch : InputString.toCharArray()){
            Count++;
        }
        System.out.println(Count);
    }
}
