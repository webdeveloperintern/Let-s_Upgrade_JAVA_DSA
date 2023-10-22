package Projects;

import java.util.Scanner;

class items{
    String[] itemname = {"T-Shirts","Jeans","Sneakers","BackPack","Hat"};
    Double[] price = {15.99,29.99,49.99,39.99,9.99};
}

class CartItems extends items{
    int index = 0;
    // String[] itemname =  new String[100];
    // double[] price = new double[100];
    int quantity [] = new int[100];
    double cost[] = new double[100];
}

public class ShoppingCart {
    
    static items itm = new items();
    static CartItems cart = new CartItems();
    public static void main(String[] args) {

        int index=0;
        System.out.println("\n\t\t\t\t******Available Products********");
        for(int i= 0 ;i < itm.itemname.length;i++){
            int j=i+1;
            System.out.println("\n\t\t\t\t"+j+".\t"+itm.itemname[i]+"(Price:$"+itm.price[i]+")\n");
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
        shopping();
        System.out.print("\n\t\t\t\tContinu Shopping : (yes/no) ");
        String Continue =sc.next();
                if(Continue.equalsIgnoreCase("no"))
                {
                    cart();
                    System.out.print("\n\t\t\t\tDo you want to remove a item from cart? : (yes/no)   ");
                    String remove = sc.next();
                    if(remove.equalsIgnoreCase("yes"))
                    {
                        remove();
                        break;
                    }
                }
    }
        sc.close();
    }
    static void shopping(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n\t\t\t\tEnter the item number to add to the cart : ");
        int itemid = input.nextInt();
        System.out.print("\n\t\t\t\tEnter the  Quantity of "+itm.itemname[itemid-1]+" in the cart : ");
        int quantity = input.nextInt(); 
        cart.quantity[cart.index] = quantity; 
        cart.itemname[cart.index]=itm.itemname[itemid-1];
        cart.price[cart.index]=itm.price[itemid-1];
        cart.cost[cart.index] = itm.price[itemid-1]*cart.quantity[cart.index];
        // System.out.println(cart.cost[cart.index]);
        System.out.println("\n\t\t\t\t"+cart.itemname[cart.index]+"("+cart.quantity[cart.index]+" Units) added to the cart!");
        cart.index++;
    }
    static void cart(){
         System.out.println("\n\t\t\t\t******Your Cart********");
                double totalcost=0;
                for(int i= 0 ;i < cart.index;i++){
                int j=i+1;
                    totalcost += cart.cost[i];
                    // System.out.println(totalcost);
                    System.out.println("\n\t\t\t\t"+j+".\t"+cart.itemname[i]+"("+cart.quantity[i]+" units)-Price:$"+cart.price[i]);
                }
                System.out.println("\n\t\t\t\tTotal Cost:"+totalcost);
    }
    static void remove(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t\t\tEnter the item Id:");
        int id = sc.nextInt();
        double totalcost=0;
        System.out.println("\n\t\t\t\t******Your Cart********");
        for (int i = 0; i < cart.index; i++) {
            int j=i+1;
            if (cart.itemname[i] != cart.itemname[id-1]) {
                totalcost += cart.cost[i];
                // System.out.println(totalcost);
                System.out.println("\n\t\t\t\t"+j + ".\t" + cart.itemname[i] + "(" + cart.quantity[i]+ " units)-Price:$" + cart.price[i]);
            }
        }
        System.out.println("\n\t\t\t\tTotal Cost:" + totalcost);
        System.out.print("\n\t\t\t\tDo you want to remove a item from cart? : (yes/no)  ");
                String remove = sc.next();
                if(remove.equalsIgnoreCase("yes"))
                remove();
                else
                System.out.print("\n\t\t\t\t******* Thank You for Shopping *******\n");
    }
}
