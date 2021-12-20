
import java.io.*;
import java.util.Scanner;


public class FileOut {
    public static void main(String[] args) throws IOException {
        PrintWriter outFile = new PrintWriter("scores.txt");
        Scanner keyboard = new Scanner(System.in);
        double score;
        
        for(int i=1; i<6; i++){
            System.out.print("Enter score #" + i + ": ");
            score = keyboard.nextDouble();
            while(score<0 || score >100)
            {
                 System.out.print("Out of range. Enter a score "
                        + "between 0 and 100: ");
                score = keyboard.nextDouble();
            }
            
            outFile.println(score);
        }
        
        outFile.close();
        System.out.println("The scores have been saved in"
                + " the file.");
    }
}
