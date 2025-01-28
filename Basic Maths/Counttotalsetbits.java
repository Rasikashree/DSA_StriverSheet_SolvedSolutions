class Solution {
    public int countSetBits(int n) {
        int totalCount = 0;

        for (int i = 0; (1 << i) <= n; i++) {

            int blockSize = 1 << (i + 1);
            int completeBlocks = n / blockSize;
            totalCount += completeBlocks * (blockSize / 2);
            
            int remainder = n % blockSize;
            if (remainder >= (blockSize / 2)) {
                totalCount += remainder - (blockSize / 2) + 1;
            }
        }
        return totalCount;
    }
}
