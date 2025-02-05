import java.util.Scanner;
class Uploading {
    String name;
    String std;
    int numSubject;
    int[] marks;
    String[] Subject;
    Uploading(String n, String s, int nS, int[] m, String[] S){
        name=n;
        std=s;
        numSubject=nS;
        marks=m;
        Subject=S;
    }
    Scanner in = new Scanner(System.in);
    void setuploading(){
        for(int i=0;i<numSubject;i++){
            System.out.println("Enter the Subject : ");
            Subject[i]=in.nextLine();
            System.out.println("Enter the Marks of Subject : ");
            marks[i]=in.nextInt();
            in.nextLine();
        }
    }
}
