
package homework2;

public class Instructor {
    private String name,
            officeAddress;
    
    Instructor(String n, String oa){
        name = n;
        officeAddress = oa;
    }
    
    public String toString(){
        return name + officeAddress;
    }
}
