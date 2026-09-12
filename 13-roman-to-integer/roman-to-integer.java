class Solution {
    public int romanToInt(String s) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int ans = 0;
        
        for (int i = 0; i < symbols.length; i++) {
            while (s.startsWith(symbols[i])) {
                ans += values[i];
                s = s.substring(symbols[i].length());
            }
        }
        return ans;
    }
}