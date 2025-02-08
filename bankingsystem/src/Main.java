import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to SBI Banking");

        //username and password
        try{
            System.out.print("Enter the Username : ");
            String username=in.nextLine();
            System.out.print("Enter the Password : ");
            int pass=in.nextInt();
            in.nextLine();

            boolean ans=true;
            while(ans){
                System.out.println("Please select the Banking System (Deposit,withdraw,checkbalance,exit)");
                String option = in.nextLine().toLowerCase();
                if(option.equals("deposit")){
                    Deposit deposit = new Deposit();
                    deposit.getDeposit();
                }else if(option.equals("withdraw")){
                    Withdraw withdraw = new Withdraw(pass);
                    withdraw.getwithdraw();
                }else if(option.equals("checkbalance")){
                    Checkbalance checkbalance = new Checkbalance();
                    checkbalance.getcheckbalance();
                }else{
                    System.out.println("Please Provide an Valid Answer");
                    ans=false;
                }
            }

        }catch (Exception e){
            System.err.println("Please Enter the Valid Input");
        }

    }
}