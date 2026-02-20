class Solution {
    public List<List<Integer>> threeSum(int[] n) {
         List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(n);
         for(int i=0;i<n.length-1;i++){
            if(i>0 && n[i] == n[i-1]){
                continue;
            }
            int j=i+1;
            int k=n.length-1;

            while (j<k) {
                int sum = n[i]+n[j]+n[k];
                if(sum==0){
                    ans.add(Arrays.asList(n[i],n[j],n[k]));
                    while (j<k && n[j] == n[j+1]) {
                        j++;
                    }
                    while (j<k && n[k] == n[k-1]) {
                        k--;
                    }
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
         }
         return ans;
    }
}