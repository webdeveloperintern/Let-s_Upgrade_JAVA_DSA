package whileloop;
/*Primenumber*/
public class primenumber1 {
    public static void main(String[] args) {
        System.out.println("Prime numbers are : ");
        int number = 4;
        boolean IsPrime = false;
        while(number <= 100){
            if(number == 2 || number == 3) {
                IsPrime = true;
            }
            else{
                for(int i=2; i <= number/2;i++){
                if(number % i == 0){
                    IsPrime = false;
                    break;
                }
            }
            }
            
            if(IsPrime) System.out.println("The number is "+number+" Prime Number ");
            number++;
        }
    }
    
}