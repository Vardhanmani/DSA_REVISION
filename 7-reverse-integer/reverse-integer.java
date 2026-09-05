class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int D = x % 10;
            x = x/10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && D > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && D < -8)) {
                return 0;
            }
            res = res*10+D;
        }
        return res;
    }
}