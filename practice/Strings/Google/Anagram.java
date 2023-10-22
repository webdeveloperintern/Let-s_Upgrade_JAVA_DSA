// Anagram of a String
import java.util.Scanner;

class Anagram{
    public static void main (String[] args) {
        System.out.print("Enter the String1  : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("Enter the String2  : ");
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("The given Strings "+str1+" and "+str2+" are not Anagram");
        }else{
           if(Anagram(str1,str2)){
               System.out.println("The given Strings "+str1+" and "+str2+" are  Anagram");
           }else{
               System.out.println("The given Strings "+str1+" and "+str2+" are not Anagram");
           }
        }
    }
    
    public static boolean Anagram(String str1, String str2){
        
        char strr1[] = str1.toCharArray();
        char strr2[] = str2.toCharArray();
        char[] sorted1 = new char[str1.length()];
        char[] sorted2 = new char[str1.length()];
        
        int max1=(int)strr1[0];
        // System.out.println(max1);
        int max2=(int)strr2[0];
        for(int sort = 0; sort < str1.length()-1; sort++ ){
            if(max1 < (int)strr1[sort] && max2 < (int)strr2[sort])
            {
                max1 = (int)strr1[sort];
                max2 = (int)strr2[sort];
                sorted1[sort] = (char)max1;
                sorted2[sort] = (char)max2;
            }
        }
            System.out.println(sorted1+" "+sorted2);
        
         
            for (int i=1; i < str1.length()-1 ;i++ ) 
            {
                    if (sorted1[i] != sorted2[i])
                    {
                        return false;
                    }
            } 
            return true;
    }
}
