
import java.util.Random;

public class Coin {
    private String sideUp;
    
    Coin(){
        toss();
    }
    public void toss(){
         Random rand = new Random();
         int num = rand.nextInt(2);
         if(num == 0)
             sideUp = "tais";
         else 
             sideUp = "heads";
    }
    
    public String getSideUp(){
        return sideUp;
    }
    
}
