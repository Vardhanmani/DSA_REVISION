class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxlength = 0 ;
        for(int i=0;i<=s.length()-1;i++){
            char start = s.charAt(i);
            while(window.contains(start)){
                window.remove(s.charAt((left)));
                left++;
            }
            window.add(start);
            maxlength = Math.max(maxlength , i-left+1);
        }
        return maxlength;
    }
}