import java.util.Arrays;

class Solution {


  public void duplicateZeros(int[] arr) {
      System.out.println("test");
      int length = arr.length;
      int[] arr2 = new int[arr.length];
      for (int i =0; i<length-1; i++){
        //System.out.println("test");
        if (arr[i]==0){
          int temp = arr[i+1];
          arr2[i]=arr[i];
          arr2[i+1]=0;

          for (int j=(2+i);j<length-(2+i);j++){
            int temp2 = arr[j];
            arr2[j]=temp;
            arr2[i+j]=temp2;
          }
        }
      


      arr = arr2;   

    }
  }



  public static void main(String[] args) {
    Solution s1 = new Solution();
    int[] arr = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
    s1.duplicateZeros(arr);
    System.out.println(Arrays.toString(arr));
  }
}
