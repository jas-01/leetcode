class Solution {
    public int titleToNumber(String col) {
         int result = 0;
        for (int i = 0; i < col.length(); i++) {
            char c = col.charAt(i);
            int value = c - 'A' + 1;  
            result = result * 26 + value;}
        return result;
    }}
/* 
result = 0
'Z' → 26 → result = 0*26 + 26 = 26
'Y' → 25 → result = 26*26 + 25 = 701
*/