class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
    
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        
        int result = 0;
        while (dvd >= dvs) {
            long tempDivisor = dvs;
            long multiple = 1;
            while (dvd >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            dvd -= tempDivisor;
            result += multiple;
        }
        
        return isNegative ? -result : result;
    }
}