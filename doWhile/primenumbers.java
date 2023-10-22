package doWhile;

public class primenumbers {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("All the prime numbers between 1 - 100");
        int number = 1;
        boolean isPrime = true;
        do{
            if(number < 2){
                System.out.println("The Smallest Prime number is 2");
            }
            else
            {
                if(number % 3 == 0){
                    isPrime = false;
                }
                else{
                    for(int i= 2; i<=(int)Math.sqrt(number) && i< 4;i++){
                    if(number % i == 0){
                        isPrime =false;
                        break;
                    }
                    else{
                        isPrime =true;
                        break;
                    }
                }
                }
                
            
            }
            
            if(isPrime) System.out.println("The Number "+number+" is prime number");
            number++;
        }while(number <= 100);
    }
}
