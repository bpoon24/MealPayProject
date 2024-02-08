public class Admin {
    public static ArrayList<Student> spreadsheet;

    public Admin(){
        spreadsheet = new ArrayList<Student>();
    }

    public void addStudent(Student myStudent){
        spreadsheet.add(myStudent.getID(), myStudent);
    }

    public Student getStudent(int myID){
        return spreadsheet[myID];
    }

    public void printSpreadsheet(){
        System.out.println(spreadsheet);
    }

    public void printNegativeBalances(){
        for(int i = 0; i > spreadsheet.size(); i++){
            if(spreadsheet[i].getBalance < 0){
                System.out.print(spreadsheet[i]);
                System.out.println();
            }
        }
    }


}
