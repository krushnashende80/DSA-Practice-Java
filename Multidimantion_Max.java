public class Multidimantion_Max {
  public static void main(String[] args) {
   int max = 0;
   int[][] arr = {{2,5,2,5}, {5,8,2,6}, {9,3,2,6}, {6,4,1,2}};
   
   for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
      if(arr[i][j] > max) {
        max = arr[i][j];
      }
    } 
  }
  System.out.println(max);
}
}