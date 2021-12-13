
package ymt111_week10;

import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {
        double []scores = new double [5];
        double max,
                min,
                sum;
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.print("Enter scores[" + i +
                    "]: ");
            scores[i] = keyboard.nextDouble();
        }
        min = scores[0];
        max = scores[0];
        sum = scores[0];
        
        for(int i=1; i<scores.length; i++){
            if(scores[i] < min)
                min = scores[i];
            if(scores[i] > max)
                max = scores[i];
            
            sum += scores[i];
        }
        
        System.out.println("The max score is " + max + 
                " and the min score is " + min + " and "
                + " the average score is " + sum/scores.length);
        
    }
    
}
