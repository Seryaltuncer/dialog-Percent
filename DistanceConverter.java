public class DistanceConverter {
    /*private static double distance;
    
    DistanceConverter(double d){
        distance = d;
    }
    */
    public static double milesToKms(double d){
        
        return 1.61*d;
    }
    
    public static double kmsToMiles(double d){
        return d/1.61;
    }
    
    public static void main(String[] args) {
        System.out.println("1 mile = " + 
                DistanceConverter.milesToKms(1)+
                " km.");
    }
}
