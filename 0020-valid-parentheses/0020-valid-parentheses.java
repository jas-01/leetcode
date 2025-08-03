class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        char[] stack = new char[s.length()]; 
        int stackPos = -1; 

        for (char subChar : s.toCharArray()) {
            if (subChar == '{' || subChar == '[' || subChar == '(') {
                stackPos++; 
                stack[stackPos] = subChar;
            } else {
                if (stackPos == -1)
                    return false;
                if ((stack[stackPos] == '{' && subChar == '}') ||
                        (stack[stackPos] == '[' && subChar == ']') ||
                        (stack[stackPos] == '(' && subChar == ')')) {
                    stack[stackPos] = 0;
                    stackPos--;
                } else
                    return false;
            }
        }
        return stackPos == -1;
    }}