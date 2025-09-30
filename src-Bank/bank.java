import java.util.Scanner;

public class bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            String name = "Gabriel Kalel";
            String accountType = "Current account";
            Double accountBalance = 2550.00;
            int leave = 0;
            double deposit;
            double withdrawel;


        System.out.println("\nWelcome To Kal-El-Banks\n");
        System.out.println("***************************************");
        System.out.println("Client Data:");
        System.out.println("\nName:               " + name);
        System.out.println("Accout type:        " + accountType);
        System.out.println("Starting balance:   " + accountBalance + " $");
        System.out.println("***************************************\n");
        System.out.println("\nServices");
        System.out.println("\n1- Bank balance");
        System.out.println("2- Deposit");
        System.out.println("3- Withdrawal");
        System.out.println("4- Leave");

        while(leave != 4){

        System.out.println("\nDesired service:");
        int serviceOption = sc.nextInt();

        switch(serviceOption){
            case 1:
            System.out.println("\nYour bank balance: " + accountBalance);
            break;

            case 2:
            System.out.println("\nHow much do you wish to deposit?");
            deposit = sc.nextDouble();
            if(deposit < 0){
                System.out.println("Not a valid number.");
            } else{
            accountBalance += deposit;
            System.out.println("Updated balance: " + accountBalance + "$");
            }
            break;

            case 3:
            System.out.println("\nHow much do you wish to withdrawl?");
            withdrawel = sc.nextDouble();
            if(withdrawel > accountBalance){
                System.out.println("Not enough balance.");
            } else if (withdrawel < 0){
                System.out.println("Not a valid number.");
            } else {
            accountBalance -= withdrawel;
            System.out.println("Updated balance: " + accountBalance + "$");
            }
            break;

            case 4:
            System.out.println("\nThank you, costumer!\n");
            leave = 4;
            break;

            default:
            System.out.println("\nWe do not provide this kind of service.");
            break;
        }
    }

        sc.close();
    }
    
}
