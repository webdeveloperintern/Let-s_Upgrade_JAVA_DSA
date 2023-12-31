package Projects;

import java.util.Scanner;

public class Calc {
    private static double[][] history = new double[100][5];
    private static int historyIndex = 0;
    public static void main(String[] args) {
        System.out.println("**************** Welcome to my Calculator ***************");
        System.out.println("\n\n \t\t Enter input seperated by space \n\n");
<<<<<<< HEAD
        System.out.println("\n \t Catalogue:(Use Symbols for Operations)\n\n \t*************************************** \n\n \t+ add\t- subracttion\t * Multiplication\n \n\t/ Division\t% modulo\t^ ToPower\t \n\n\t~ SquareRoot\t c Clear Console\t h for History of calculations\n\n\t x to exit");
=======
        System.out.println("\n \t Catalogue:(Use Symbols for Operations)\n\n \t*************************************** \n\n \t+ add\t- subracttion\t * Multiplication\n \n\t/ Division\t% modulo\t^ ToPower\t \n\n\t~ SquareRoot\t e Clear Console\t 0 _ 0 or _ 0 for History of calculations");
>>>>>>> d471a2d54194058e94b3c0cd545f4316fd796707
        System.out.println("\n Enter the inputs and get Results \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number1 = sc.nextInt(); 
        System.out.print("Enter the operator : ");
        char operand = sc.next().charAt(0);
        System.out.print("Enter the number : ");
        int number2 = sc.nextInt();
        calculator(operand,number1,number2);
        sc.close();
    }

    //input
    public static void inputs(double d){
        Scanner sc = new Scanner(System.in);
        double number1 = d;
        System.out.print("Enter the operator : ");
        char operand = sc.next().charAt(0);
        if(operand == 'h'|| operand == 'e' || operand == 'x' || operand == 'H'|| operand == 'E' || operand == 'X')
        {
            calculator(operand, 0, 0);
        }
        else{
            System.out.print("Enter the number : ");
            int number2 = sc.nextInt();
            calculator(operand,(int) number1 , number2);
        }
        sc.close();
    }


    //calcfunction
    public static void calculator(char operand,int n1,int n2)
    {
        // System.out.println(n1 +n2+operand );
        switch(operand){
            case '+':
                System.out.println(" = "+add(n1,n2));
                StoreHistory(n1,operand,n2,add(n1,n2));
                inputs(add(n1, n2));
                break;
            case '-':
                System.out.println(" = "+sub(n1,n2));
                 StoreHistory(n1,operand,n2,sub(n1,n2));
                inputs(sub(n1,n2));
                break;
            case '*':
                System.out.println(" = "+multiply(n1,n2));
                 StoreHistory(n1,operand,n2,multiply(n1,n2));
                inputs(multiply(n1,n2));
                break;
            case '/':
                System.out.println(" = "+divide(n1,n2));
                 StoreHistory(n1,operand,n2,divide(n1,n2));
                inputs(divide(n1,n2));
                break;
            case '%':
                System.out.println(" = " + modulo(n1, n2));
                 StoreHistory(n1,operand,n2,modulo(n1,n2));
                inputs(divide(n1, n2));
                break;
            case '~':
                System.out.println(" = "+SquareRoot(n2));
                break;
            case 'h':
            case 'H':
                // System.out.println("Underscore switch case entered.");
                displayHistory();
                inputs(n1);
                break;
            case 'c':
            case 'C':
                System.out.println("\033[H\033[2J");
                main(null);
                break;
            case '^':
                System.out.println(" = "+ power(n1, n2));
                break;
            case 'x':
            case 'X':
                System.out.println("\033[H\033[2J");
                main(null);
                break;
            case 'e':
            case 'E':
                System.out.print("Do you really want to terminate the opartion : (y/n) ");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                String ans = sc.nextLine();
                if(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")){
                System.out.println("\033[H\033[2J");
                System.out.println("Thank You 0 <");
                }
                main(null);
                break;

            default:
                System.out.println("Enter the valid operand ---");
                inputs(n1);
                break;
        }
            
    }
    //History-display
    public static void displayHistory(){
        System.out.println("\n\n****************** History ******************");
        for (int i = 0; i < historyIndex-1; i++) {
            System.out.println(history[i][0] + " " + (char)history[i][1] + " " + history[i][2] + " = "+ history[i][3]);
        }
        System.out.println("****************** End of History ******************\n\n");
        
    }
    //store-History
    public static void StoreHistory(double n1,char operand,int n2,double Results){
                history[historyIndex][0] = n1;
                history[historyIndex][1] = (char)operand;
                history[historyIndex][2] = n2;
                history[historyIndex][3] = Results;
                historyIndex++;
    }

    //Modulos
    public static int modulo(int a,int b){
        if(a<b) return a;
        else{
            int c = b%a;
            return c;
        }
    }

    //addition
    public static int add(int a, int b){
        int c = a+b;
        return c;
    }

    //subracton
    public static int sub(int a,int b){
        int c = a-b;
        return c;
    }

    //Multiplication
    public static int multiply(int a,int b){
        int c = a*b;
        return c;
    }

    //Division
    public static double divide(double a,double b){
        if(a==0) return 0;
        double c = a/b;
        return c;
    }

    //Power
    public static double power(double a,int b){
        return (int)a^b;
    }

    //Square
    public static double SquareRoot(double a){
        return Math.sqrt(a);
    }
}
