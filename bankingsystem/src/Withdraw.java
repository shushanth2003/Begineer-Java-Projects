import java.util.Scanner;
class Withdraw extends Deposit{
    int getamount;
    int pass;
    Withdraw(int pass){
        super();
        this.pass=pass;
    }
    void getwithdraw(){
        Scanner in = new Scanner(System.in);

        System.out.println("Please Provide Account Passwords");
        int password = in.nextInt();
        if(password==pass){
            System.out.println("Enter the amount from savings");
            getamount = in.nextInt();
            if(getamount<savingamount){
                System.out.println("Get Amount : " +getamount);
                int rem = savingamount-getamount;
                System.out.println("Remaining Amount :"+rem);
                savingamount=rem;
            }else{
                System.out.println("You can withdraw Amount Because you have these much savings "+savingamount);
            }

        }else{
            System.out.println("Please Provide the Valid Password");
        }
    }
}
