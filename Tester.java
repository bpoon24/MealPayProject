public class Tester {
    public static void main(String[] args) {
           System.out.println("Welcome to MealPay.");  
           Admin PolySpreadsheet = new Admin();
           System.out.println();
           
           System.out.println("Creating students...");
           Student BrendanPoon = new Student("Brendan Poon");
           Student ConnorPoon = new Student("Connor Poon");
           Student JeffreyLiu = new Student("Jeffrey Liu");
           Student BrendanPoon2 = new Student("Brendan Poon");
           System.out.println();

           System.out.println("Displaying IDs...");
           System.out.println(BrendanPoon.getID());
           System.out.println(ConnorPoon.getID());
           System.out.println(JeffreyLiu.getID());
           System.out.println(BrendanPoon2.getID());
           System.out.println();
           
           System.out.println("Adding students to PolySpreadsheet...");
           PolySpreadsheet.addStudent(BrendanPoon);
           PolySpreadsheet.addStudent(ConnorPoon);
           PolySpreadsheet.addStudent(JeffreyLiu);
           PolySpreadsheet.addStudent(BrendanPoon2);
           System.out.println();

           System.out.println("Displaying students...");
           PolySpreadsheet.printSpreadsheet();
           System.out.println();

           System.out.println("Adding funds...");
           PolySpreadsheet.addFunds(0, 100);
           PolySpreadsheet.addFunds(1, 5); 
           PolySpreadsheet.addFunds(2, 20); 
           PolySpreadsheet.addFunds(3, 150); 
           PolySpreadsheet.printSpreadsheet();
           System.out.println();

           System.out.println("Buying lunches...");
           PolySpreadsheet.buyLunch(0);
           PolySpreadsheet.buyLunch(1);
           PolySpreadsheet.buyLunch(2);
           //JeffreyLiu buys 10 lunches.
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           PolySpreadsheet.buyLunch(2);
           //BrendanPoon2 buys 7 lunches.
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.buyLunch(3);
           PolySpreadsheet.printSpreadsheet();
           System.out.println();

           System.out.println("Displaying students with negative balances...");
           PolySpreadsheet.printNegativeBalances();
           System.out.println();

           System.out.println("Displaying student with ID number 3...");
           PolySpreadsheet.getStudent(3);
           System.out.println();
    }
}
