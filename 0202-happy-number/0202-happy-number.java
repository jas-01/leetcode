class Solution {
    public boolean isHappy(int num) {

        int tor=num,rab=num;
        do{
            tor=sumcall(tor);
            rab=sumcall(sumcall(rab));
        }while(tor!=rab);
        return tor==1;
    }

private int sumcall(int n){
    int s=0;
        while(n>0){
            int t=n%10;
         s+=t*t;
            n/=10;
        }
        return s;
    }
}