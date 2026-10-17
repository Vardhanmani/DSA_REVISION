class Solution {
    public void helper(String s, int start , List<String>basket , List<List<String>>result){
        if(start == s.length()){
            result.add(new ArrayList<>(basket));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(ispalindrome(s,start,i)){
                basket.add(s.substring(start,i+1));
                helper(s,i+1,basket,result);
                basket.remove(basket.size()-1);
            }
        }
    }
    public boolean ispalindrome(String s , int left, int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s,0,new ArrayList<>(),result);
        return result;
    }
}