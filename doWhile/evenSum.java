package doWhile;


public class evenSum {
    public static void main(String[] args) {
        System.out.println("Sum of even Numbers :");
        int number = 2,sum=0;
        do{
            if(number % 2 == 0) sum+=number;
            number++;
        }while(number <= 100);
        System.out.println("The sum os all even numbers between 1 -100 = "+sum);
    }
}
