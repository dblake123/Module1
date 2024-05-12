import java.util.Scanner;

public class Grades {
    public static void main(String[] args)
{
    final int MIN_COST = 100;
    final int MAX_COST = 200;   
    int cost = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the cost: ");
    cost = in.nextInt();
    if (cost < MIN_COST)   
    {   
       System.out.println("Error: The cost is too low.");
    }   
    else if (cost > MAX_COST)   
    {      
       System.out.println("Error: The cost is too high.");   
    }   
    else   
    {      
        System.out.println("The cost entered is in the valid cost range.");
    }

}
    // public static void main(String[] args) throws Exception {
    //     Scanner input = new Scanner(System.in);
    //     boolean found = false; 
    //     String userLetterGrade = "";
    //     int userGPA = 0;
    //     int i = 0;
    //     int count = 2000 * 3000 * 4000;
    //     System.out.println("count=" + count);
    //     String[] gradeChart = {"96", "100.00", "A ", "4.0", 
    //                        "90", "95.99 ", "A-", "3.7",
    //                        "87", "89.99 ", "B+", "3.3",
    //                        "84", "86.99 ", "B ", "3.0",
    //                        "80", "83.99 ", "B-", "2.7",
    //                        "77", "79.99 ", "C+", "2.3",
    //                        "74", "76.99 ", "C ", "2.0", 
    //                        "70", "73.99 ", "C-", "1.7", 
    //                        "67", "69.99 ", "D+", "1.3", 
    //                        "64", "66.99 ", "D ", "1.0", 
    //                        "60", "63.99 ", "D-", "0.7",
    //                        "0 ", "59.99 ", "F ", "0.0"
    //                     };

    //     System.out.println("Hi, I convert letter grade into a GPA grade. Ex: B to 3.0.");
    //     System.out.println("This is the chart");
    //     System.out.println("Low" + " " + "High" + " " + "    Letter" + " " + "GPA");
    //     while(i<45){
    //         System.out.println(gradeChart[i] + "  " + gradeChart[i+1]+ "   " + gradeChart[i+2]+ "     " + gradeChart[i+3]);
    //         i = i+4;
    //     }
    //     System.out.println("Please Enter your Letter Grade. Ex: A, B-, C+");
    //     userLetterGrade = input.nextLine();
    //     input.close();
    //     System.out.println("");
    //     System.out.println("");
    //     System.out.println("You Entered: " + userLetterGrade);
    //     userLetterGrade = userLetterGrade.toUpperCase();
    //     if(userLetterGrade.length()==1){
    //         userLetterGrade = userLetterGrade + " ";
    //     }
    //     i = 0;  
    //     while((i<45) && (found==false)){
    //         if(gradeChart[i+2].contains(userLetterGrade)){
    //             userGPA = i+2;
    //             found = true;
    //         }
    //         i = i+4;
    //     }
    //     if(found==true){
    //         System.out.println("Your GPA grade is: " + gradeChart[userGPA+1]);
    //     }
    //     else{
    //         System.out.println("Invalid Letter Grade");
    //     }
    // }
}
