package MealPayProject;
import java.util.*;

public class Admin {
    public static ArrayList<Student> spreadsheet;

    public Admin(){
        spreadsheet = new ArrayList<Student>();
    }

    //General info
    public void addStudent(Student myStudent){
        spreadsheet.add(myStudent.getID(), myStudent);
    }

    public Student getStudent(int myID){
        return spreadsheet.get(myID);
    }

    public void printSpreadsheet(){
        System.out.println(spreadsheet);
    }

    public void printNegativeBalances(){
        for(int i = 0; i > spreadsheet.size(); i++){
            if(spreadsheet.get(i).getBalance() < 0){
                System.out.print(spreadsheet.get(i));
                System.out.println();
            }
        }
    }

    //Transactions
    public void addFundsToSpreadsheet(int myID, int myAmount){
        spreadsheet.get(myID).addFunds(myAmount);
    }

    public void buyLunchForSpreadsheet(int myID){
        spreadsheet.get(myID).buyLunch();
    }

}
