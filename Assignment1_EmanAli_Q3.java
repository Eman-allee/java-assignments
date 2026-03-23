import java.util.Scanner;
public class Assignment1_EmanAli_Q3 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

        double marks;
        double total=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter marks for subject " +i+ ": ");
            marks= input.nextInt();

            total= total + marks;

        }
        System.out.println("TOTAL MARKS ARE:"+total);
        double average= total/5.0;
        System.out.println("Average is:"+average);

        String grade;
        if(average>=85) {
            System.out.println("Grade A");
        }
            else if(average>=70) {
            System.out.println("Grade B");
        }
            else if(average>=60) {
            System.out.println("Grade C");
        }
            else if(average>=50) {
            System.out.println("Grade D");
        }
           else{
            System.out.println("Fail");

        }

    }
}