import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = in.nextLine();
        System.out.print("Enter the Standard : ");
        String std=in.nextLine();
        System.out.print("How many subjects do you have ? : ");
        int numSubject=in.nextInt();
        int[] marks=new int[numSubject];
        String[] Subject = new String[numSubject];

        //uploading the data to class
        Uploading uploading =new Uploading(name,std,numSubject,marks,Subject);
        uploading.setuploading();

        //Mark analysis to Student
        Markanalysis markanalysis = new Markanalysis(name,std,numSubject,marks,Subject);
        markanalysis.setMarketanalysis();

        //Analysis the grading System
        Gradingsystem gradingsystem = new Gradingsystem(name,std,numSubject,marks,Subject);
        gradingsystem.setGrading();
    }
}