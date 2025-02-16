//import scanner
import java.util.Scanner;

//declare Blueprint class
public class Blueprint {

   //declare int numScores + double average
    private int numScores;
    private double average;

    //Initalize variable
    public Blueprint() {
        numScores = 0;
        average = 0.0;
    }//ends public Blueprint()

    //Declare getAverage
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        //user input
        System.out.println("Enter test scores (Press -1 to quit):");
        int score = scanner.nextInt();

        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter test scores (Press -1 to quit):");
            score = scanner.nextInt();
        }//ends while loop

        if (count > 0) {
            average = (double) sum / count;
            numScores = count;
        } //ends if
        else {
            average = 0.0; // Set average to
        }//ends else

        //Round
        average = Math.round(average * 100.0) / 100.0;
    }//ends getAverage()

    //toString
    public String toString() {
        return "The average of the " + numScores + " scores entered is " + average + ".";
    }//ends toString()
}//ends Blueprint Class




