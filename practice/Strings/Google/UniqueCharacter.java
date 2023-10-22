//Non NonRepeateanner
import java.util.Scanner;

class NonRepeate{
    public static void main (String[] args) {
        System.out.print("Enter the String");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(char repeat:word.toCharArray()){
            if(word.indexOf(repeat) == word.lastIndexOf(repeat)){
                System.out.println("the First Non Repeating Character in the given word "+word+" is : "+repeat);
                break;
            }
        }
                // System.out.println("the First Non Repeating Character in the given word "+word+" is : "+NoRepeate);
    }
}


//Non NonRepeateanner all chara
import java.util.Scanner;

class NonRepeate{
    public static void main (String[] args) {
        System.out.print("Enter the String");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(char repeat:word.toCharArray()){
            if(word.indexOf(repeat) == word.lastIndexOf(repeat)){
                System.out.println("the First Non Repeating Character in the given word "+word+" is : "+repeat);
            }
        }
                // System.out.println("the First Non Repeating Character in the given word "+word+" is : "+NoRepeate);
    }
}
