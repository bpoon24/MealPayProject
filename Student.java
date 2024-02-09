package MealPayProject;
public class Student {
    private String name;
    private int balance;
    private static int IDGen = 0;
    private int ID;


    public Student(String myName){
        name = myName;
        balance = 0;
        ID = IDGen;
        IDGen++;
    }

    public int getID(){
        return ID;
    }

    public int getBalance(){
        return balance;
    }

    public String toString(){
        return "Name: " + name + ",ID: " + ID + ",Balance: " + balance;
    }
}