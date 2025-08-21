class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
         k%=n;
        int t[]=new int[n];
        for(int i=0;i<k;i++){
        t[i]=arr[i+n-k];
        }
        for(int j=0;j<n-k;j++){
            t[j+k]=arr[j];
        }
        for(int i=0;i<n;i++){
            arr[i]=t[i];       
    }
}}