import java.util.Scanner;
class Deposit {
    String option;
    int amount;
    Deposit(){
        this.option=option;
        this.amount=amount;
    }
    void getDeposit(){
        System.out.println("Enter the amount");
        Scanner in = new Scanner(System.in);
        amount=in.nextInt();
    }
}
