class Solution {
    public int arrayPairSum(int[] n) {
        Arrays.sort(n);
       int c=0;
       for(int i=0;i<n.length;i+=2){
        c+=n[i];       } return c;
    }
}