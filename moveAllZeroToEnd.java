public class moveAllZeroToEnd {
    public static void main(String[] args) {
   int[] arr = {10,14,3,0,9,0,11,0,2};
             //{10,14,3,9,11,2,0,0,0};
   int zero = 0;
   
   for(int i=0;i<arr.length;i++){
     for(int j=i;j<arr.length-1;j++){
         if(arr[j] == zero) {
           int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
           
         }
       }
       System.out.print(arr[i]+  " ");
     }
     
   }
}
