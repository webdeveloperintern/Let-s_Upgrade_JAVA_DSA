package doWhile;

public class AmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Amstrong Numbers between 1 - 1000");
        int number = 1,ndigit ,Amstrongnumber,temp;
        do{
            Amstrongnumber=0;
            ndigit = 0;
            temp=number;
            int power = temp;
            while(power != 0){
                int reminder = power % 10;
                ndigit++;
                power /= 10;
            }
            while(temp != 0){
                int reminder = temp % 10;
                Amstrongnumber +=(int)Math.pow(reminder, ndigit);
                temp /= 10;
            }

            if(number == Amstrongnumber)
        {
            System.out.println("The given number "+number+" is a Amstrong Number");
        }
        number++;
        }while(number <= 1000);
        
    }
}
