class Solution {
    public void moveZeroes(int[] n) {
        int t=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                n[t++]=n[i];
            }
        }
        while(t<n.length){
            n[t++]=0;
        }
        
    }
}