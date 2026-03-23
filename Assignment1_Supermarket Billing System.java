import java.util.Scanner;
public class Assignment1_EmanAli_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of items:");
        int n= input.nextInt();
        double subtotal=0;

        for(int i=0;i<n;i++){
            System.out.print("Enter the item name:");
            String itemName =input.next();

            System.out.print("Enter the price:");
            double price=input.nextDouble();

            System.out.print("Enter the quantity:");
            int quantity =input.nextInt();
             subtotal= price * quantity;
        }

        double discount=0;
     if(subtotal>500) {
         discount = subtotal * 0.10;
     } else if(subtotal>1000){
              discount= subtotal*0.15;

     }
     double finalbill= subtotal-discount;

     System.out.println("---- BILL DETAILS ----");
        System.out.println("Subtotal is:"+subtotal);
        System.out.println("Discount is:"+discount);
        System.out.println("Final bill is:"+finalbill);

        }

}
