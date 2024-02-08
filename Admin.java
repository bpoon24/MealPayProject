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
}
