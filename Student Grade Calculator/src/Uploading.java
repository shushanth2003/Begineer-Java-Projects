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
    void setMarkanalysis(){
        for(int i=0;i<numSubject;i++){
            System.out.print("Enter the "+numSubject+" Subjects");
            Subject[i]=in.nextLine();
            System.out.print("Enter the Marks of "+"each "+numSubject+" Subject : ");
            marks[i]=in.nextInt();
        }
    }
}
