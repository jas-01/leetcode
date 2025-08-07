class Solution {
    public String reverseVowels(String s) {
        String  v="AEIOUaeiou";
        char ch[]=s.toCharArray();
        int l=0,r=ch.length-1;
        while(l<r){
            while(l<r && v.indexOf(ch[l])==-1){ l++;}
            while(l<r && v.indexOf(ch[r])==-1){ r--;}
        
            char t=ch[l];
            ch[l]=ch[r];
            ch[r]=t;
            l++;
            r--;
        }
        return new String(ch);
    }
}