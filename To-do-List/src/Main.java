import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("How many lists are you managing? Please provide a well-structured response ");
        int numList=in.nextInt();
        in.nextLine();
        System.out.println("Please Enter the Product and Conducts");
        ArrayList<String> addTolist=new ArrayList<>();
        for(int i=0;i<numList;i++){
            String addName = in.nextLine();
            addTolist.add(addName);
        }
        System.out.println("TodoList : "+addTolist);
        Deleting deleting = new Deleting(numList,addTolist);
        deleting.setDeleting();
    }
}