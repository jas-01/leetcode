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