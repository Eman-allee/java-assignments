import java.util.Scanner;
public class Assignment1_EmanAli_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctPin = 8990;
        double balance = 8000;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the PIN:");
            int PIN = input.nextInt();

            if (PIN == correctPin) {

                System.out.println(" Welcome to the ATM!! \nSelect from the options");
                int option = 0;
                while (option != 4) {

                    System.out.println("1. Check balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");
                    System.out.println(" Choose an option");

                    option = input.nextInt();

                    switch (option) {

                        case 1:
                            System.out.println("Your balance is:" + balance);
                            break;

                        case 2:
                            System.out.println("Enter deposit money:");
                            double depositMoney = input.nextDouble();
                            balance = balance + depositMoney;
                            System.out.println("New balance is:" + balance);
                            break;

                        case 3:
                            System.out.println("Enter withdrawal Amount");
                            double withDrawal = input.nextDouble();
                            if (withDrawal > balance) {
                                System.out.println("INSUFFICIENT BALANCE");
                            } else {
                                balance = balance - withDrawal;
                                System.out.print("Remaining balance is:" + balance);
                            }
                            break;

                        case 4:
                            System.out.println("Exiting!!! Thanks for using ATM!!");
                            break;

                        default:
                            System.out.println("Invalid Choice!! TRY AGAIN!");
                    }
                }
                break;
            } else {
                System.out.println("Incorrect Pin. TRY AGAIN!!");
            }

        }
    }
}
