class Gradingsystem extends Markanalysis{

    Gradingsystem(String n, String s, int nS, int[] m, String[] S) {
        super(n, s, nS, m, S);
    }
    void setGrading(){
        if (average >=90)
            System.out.println("Grade = A");
        else if(average>=80)
            System.out.println("Grade = B");
        else if(average>=70)
            System.out.println("Grade = C");
        else if(average >=60)
            System.out.println("Grade = D");
        else
            System.out.println("Grade = F");
    }
}
