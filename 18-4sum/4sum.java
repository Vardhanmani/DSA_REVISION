import java.util.Arrays;
class Solution {
    public List<List<Integer>> fourSum(int[] n, int target) {
          List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(n);
        for(int i=0;i<=n.length-1;i++){
            if(i>0 && n[i] == n[i-1]){
                continue;
            }
            for(int j=i+1;j<=n.length-1;j++){
                 if (j > i + 1 && n[j] == n[j - 1]){
                    continue;
                }    
                int k=j+1;
                int m=n.length-1;
                while (k<m) {
                     long sum = (long)n[i] + n[j] + n[k] + n[m];
                    if(sum == target){
                        ans.add(Arrays.asList(n[i],n[j],n[k],n[m]));
                         while (k<m && n[k] == n[k+1]) {
                        k++;
                    }
                    while (k<m && n[m] == n[m-1]) {
                        m--;
                    }
                    k++;
                    m--;
                    }
                    else if (sum>target) {
                        m--;
                    }else{
                        k++;
                    }
                }
            }
        }    
        return ans;

    }
}