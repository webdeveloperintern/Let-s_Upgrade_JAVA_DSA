package whileloop;
/*Primenumber*/
public class primenumber1 {
    public static void main(String[] args) {
        System.out.println("Prime numbers are : ");
        int number = 4;
        boolean IsPrime = false;
        while(number <= 100){
            if(number < 2){
                System.out.println("The Smallest Prime number is 2");
            }
            else
            {
                if(number % 3 == 0){
                    IsPrime = false;
                }
                else{
                    for(int i= 2; i<=(int)Math.sqrt(number) && i< 4;i++){
                    if(number % i == 0){
                        IsPrime =false;
                        break;
                    }
                    else{
                        IsPrime =true;
                        break;
                    }
                }
                }
                
            
            }
            
            if(IsPrime) System.out.println("The Number "+number+" is prime number");
            number++;
        }
    }
    
}