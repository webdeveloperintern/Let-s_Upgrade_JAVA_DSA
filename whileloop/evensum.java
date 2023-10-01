package whileloop;
/*Sum of EVEN NUMBER */
public class evensum {
    public static void main(String[] args) {
        System.out.print("Sum of Even Numbers : ");
        int number = 1,sum=0;
        while(number <= 100){
            if(number % 2 == 0){
                sum+=number;
            }
            number++;
        }
        System.out.println(sum);
    }
}
