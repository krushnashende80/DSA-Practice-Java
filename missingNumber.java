import java.util.Arrays;

public class missingNumber {
    
    public static void main(String[] args){
        int[] arr = {3, 1, 4, 5, 6, 9, 7, 8};
        Arrays.sort(arr); // Array becomes: {1, 3, 4, 5, 6, 7, 8, 9}
        
        int miss = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            if(arr[i] != i + 1){
                miss = i + 1; 
                break;
            }
        }
        // If all numbers up to N match perfectly, the missing number is the next one (N + 1)
        if(miss == 0) {
            miss = n + 1;
        }
        System.out.println("Missing number is: " + miss); 
    }
}
