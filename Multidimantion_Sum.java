public class Multidimantion_Sum {
  public static void main(String[] args) {
   int sum = 0;
   int[][] arr = {{1,3,5,7},{5,4,7,2},{9,2,7,1}};
     
   for(int i=0;i<arr.length;i++){
     for(int j=0;j<arr.length+1;j++){
         sum += arr[i][j];
      }
    
  }
   System.out.println(sum);
  }
}