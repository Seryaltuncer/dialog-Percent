package StringExp ;

public class StringClassEx1 {
    public static void main(String[] args) {
        String str = "YMT111 - Algorithm and Programming "
                + "and Intro to Comp Sc." + 
                " and Maths and Physics";
        
       
        if(str.startsWith("ymt"))
            System.out.println("The string fits!");
        
        if(str.endsWith("ing."))
            System.out.println("The string fits!");
        
        if(str.regionMatches(true, 10, "algorithm", 0, 9))
            System.out.println("It matches!");
        
        
        
        int position = str.indexOf("and");
        int count = 0;
       
        while(position != -1){
            ++count;
            position = str.indexOf("and", position+1);
        }
        
        System.out.println(count);
        
    }
    
}
