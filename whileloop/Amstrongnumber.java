package whileloop;

import java.util.Scanner;

public class Amstrongnumber {
    public static void main(String[] args) {
        System.out.println("AmstrongNumber : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit =number,result = 0,ndigits=0,Nnumber=number;
        while(Nnumber !=0)
        {
            int reminder = Nnumber % 10;
            ndigits++;
            Nnumber /=10;
            // System.out.println(reminder);
        }
        while(number != 0){
            int reminderr = number % 10;
            int temp =(int) Math.pow(reminderr,ndigits);
            result +=temp;
            number/=10;
        }
        if(digit == result)
        {
            System.out.println(digit + " is a Amtrong Number");
        }
        else
        {
            System.out.println(digit + " is not a Amstrong Number");
        }
        sc.close();

    }
}
