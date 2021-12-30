
import java.io.*;
import java.util.Scanner;


public class FileIn {
    public static void main(String[] args) throws IOException{
        File file = new File("scores.txt");
        
        Scanner inputFile = new Scanner(file);
        double sum=0.0;
        int count = 0;
              
        
        while(inputFile.hasNext()){
            sum += Double.parseDouble(inputFile.next());
            count++;
        }
        
        inputFile.close();
        
        System.out.println("The average score is " + sum/count);
    }
}
