class Solution {
    public boolean canWinNim(int n) {
      return n%4!=0;  
    }
}
/*
The pattern repeats every 4 numbers:

n	Winner (if first)
1	You win
2	You win
3	You win
4	You lose
5	You win
6	You win
7	You win
8	You lose

*/