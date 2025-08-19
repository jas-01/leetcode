class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,t=0;

        for(int num:nums){
            if(num==0) {count++; t+=count;}
            else {count =0;}
        }
        return t;
    }
}
/*
num=1 → count=0, total=0

num=3 → count=0, total=0

num=0 → count=1, total=1

num=0 → count=2, total=3

num=2 → reset → count=0

num=0 → count=1, total=4

num=0 → count=2, total=6

num=4 → reset → count=0

Output: 6
*/