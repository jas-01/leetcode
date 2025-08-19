class Solution {
    public String convertToTitle(int col) {
        StringBuilder ans=new StringBuilder();
        while(col>0){
            col--;
            int rem=col%26;
            char ch=(char)('A'+rem);
            ans.append(ch);
            col/=26;
        }
        StringBuilder  rev=new StringBuilder();
    for(int i=ans.length()-1;i>=0;i--){
        rev.append(ans.charAt(i));
    }
    return rev.toString();
    }
}
/*
We expect "ZY".
1.First loop

columnNumber = 701
columnNumber-- → 700
remainder = 700 % 26 = 24 → 'Y'
Append 'Y'
columnNumber = 700 / 26 = 26

sb = "Y"

2.Second loop

columnNumber = 26
columnNumber-- → 25
remainder = 25 % 26 = 25 → 'Z
Append 'Z'
columnNumber = 25 / 26 = 0

sb = "YZ"

Reverse
Result = "ZY" */