class Solution {
    public int addDigits(int n) {
    while(n>=10){
        int s=0;
        while(n>0){
            int t=n%10;
            s+=t;
            n/=10;
        }n=s;}
        return n;
    }
}