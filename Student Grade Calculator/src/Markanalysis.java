class Markanalysis extends Uploading {
    int totalmarks = 0;
    double average = 0; // Change average to double to retain decimal precision

    Markanalysis(String n, String s, int nS, int[] m, String[] S) {
        super(n, s, nS, m, S);
    }

    void setMarketanalysis() {
        for (int i = 0; i < numSubject; i++) {
            totalmarks += marks[i];
        }
        average = (double) totalmarks / numSubject;
        System.out.println("Total Marks of " + name + " : " + totalmarks);
        System.out.println("Average Marks of " + name + " : " + average);
    }
}