public class LargestNumFromIthPosition {
  public static void main(String[] args) {
   int[] arr = {1,9,8,6,3,4,2};
             //{9,9,8,6,4,4,2};
   int[] ans = new int[arr.length];
   
   for(int i=0;i<arr.length;i++){
     for(int j=i;j<arr.length;j++){
       if(ans[i] < arr[j]){
         ans[i] = arr[j];
       }
     }
   }
   for(int display : ans){
     System.out.print(display + " ");
     }
    }
}