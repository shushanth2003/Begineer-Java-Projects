import java.util.Scanner;
class Deposit {
    String option;
    int savingamount;
    Deposit(){
        this.option=option;
        this.savingamount = savingamount;
    }
    void getDeposit(){
        System.out.println("Enter the amount");
        Scanner in = new Scanner(System.in);
        savingamount =in.nextInt();
    }
}
