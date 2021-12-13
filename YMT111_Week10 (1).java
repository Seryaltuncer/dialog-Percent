
package WorkPage;

public class WorkPage {

    public static void main(String[] args) {
        int []nums = {1, 10, -2, 7, 4, 2};
        
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        
        selectionSort(nums);
        
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        
        if(binarySearch(nums, 7)== -1)
            System.out.println("7 does not exist in the array");
        else 
            System.out.println("7 is at index" + binarySearch(nums, 7));
        
    }
    
    public static void selectionSort(int []array){
        int startScan, index, minIndex, minValue;
        
        for(startScan = 0; startScan<array.length-1; startScan++){
            minIndex = startScan;
            minValue = array[startScan];
            
            for(index = startScan + 1; index<array.length; index++){
                if(array[index]<minValue){
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
    public static int binarySearch(int []array, int x){
        int first, last, mid, index;
        boolean found;
        
        first = 0;
        last = array.length - 1;
        found = false;
        index = -1;
        
        while(!found && first <= last){
            mid = (first + last)/2;
            if(array[mid] == x){
                found = true;
                index = mid;
            }
            else if(array[mid] > x){
                last = mid -1;
            }
            else{
                first = mid + 1;
            }
        }
        
        return index;
    }
    
}
