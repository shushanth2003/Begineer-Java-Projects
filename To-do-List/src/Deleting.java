import java.util.ArrayList;
import java.util.Scanner;
class Deleting {
    int numList;
    ArrayList<String> addList;
    String condition;
    Deleting(int numList,ArrayList<String> addList){
        this.numList=numList;
        this.addList=addList;
    }
    void setDeleting(){
        Scanner in = new Scanner(System.in);
        System.out.print("Do you need to remove it? Please respond with 'Yes' or 'No'.");
        condition=in.nextLine();
        if(condition.equals("Yes")){
            System.out.print("Tell me which Line I word I want remove");
            String removeWord=in.nextLine();
            for (int i = numList - 1; i >= 0; i--) {
                if (addList.get(i).equals(removeWord)) {
                    addList.remove(i);
                }
            }
            System.out.print("Updating TodoList : ");
            System.out.println(addList);
        }else{
            System.out.println("Thank you for Visiting ToDoList");
        }
    }
}
