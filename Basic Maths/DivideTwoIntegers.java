class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;  // Overflow case
        }
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            long multiple = 1;

            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;  // Double the divisor
                multiple <<= 1;     // Double the multiple
            }

            absDividend -= tempDivisor;
            quotient += multiple;  // Add the corresponding multiple to the quotient
        }
        if ((dividend < 0) ^ (divisor < 0)) {
            quotient = -quotient;
        }

        return quotient;
    }
}
