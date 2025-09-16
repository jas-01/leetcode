class Solution {
    public int maxProfit(int[] pr) {
        int max=0;
        int minval=Integer.MAX_VALUE;
        for(int p:pr){
            if(minval>p) minval=p;
            max=Math.max(max,p-minval);
}
        return max;
}}
/*
Detailed trace for p = [7,1,5,3,6,4]:

s	p	mv (after step)	profit if sell today = price - minPrice	maxProfit (after step)
0	7	7	         	0
1	1	1		        0
2	5	1	5 - 1 = 4	4
3	3	1	3 - 1 = 2	4
4	6	1	6 - 1 = 5	5
5	4	1	4 - 1 = 3	5

Return 5. (Buy at 1, sell at 6.)
*/