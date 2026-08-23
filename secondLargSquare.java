public class secondLargSquare {
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 7, 3, 1, 6, 9, 8};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        // Loop 1: Find the absolute maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Loop 2: Find the second maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        
        secondMax = secondMax * secondMax;
        System.out.println("Second largest square is: " + secondMax);
    }
}
