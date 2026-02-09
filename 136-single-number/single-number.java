class Solution {
    public int singleNumber(int[] n) {
      int arr=0;
      for(int i=0;i<n.length;i++){
        arr=arr^n[i];
      }
      return arr;
    }
}