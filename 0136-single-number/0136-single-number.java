class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }
}
/* xor 
00 - 0
01 -1
10 -1
11 - 0
so when a number is repeated it actually cancel
Step	num	result before	result after (result ^ num)	Why
1	4	0	4	0 ^ 4 = 4
2	1	4	5	4 ^ 1 = 5
3	2	5	7	5 ^ 2 = 7
4	1	7	6	7 ^ 1 = 6 (1 cancels with earlier 1)
5	2	6	4	6 ^ 2 = 4 (2 cancels with earlier 2)
*/