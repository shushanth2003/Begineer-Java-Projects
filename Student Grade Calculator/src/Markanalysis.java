class Markanalysis extends Uploading {
    public int totalmarks=0;
    public int average=0;
    Markanalysis(String n, String s, int nS, int[] m, String[] S) {
        super(n, s, nS, m, S);
    }
    void setMarketanalysis(){
        for (int i = 0; i < numSubject; i++) {
            totalmarks+=marks[i];
        }
        average=totalmarks/2;
        System.out.println("Total Marks of "+name+totalmarks);
        System.out.println("Average Marks of "+ name+average);
    }
}
