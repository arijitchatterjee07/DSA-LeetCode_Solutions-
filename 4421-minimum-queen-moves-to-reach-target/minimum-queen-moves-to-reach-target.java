class Solution {
    public int minQueenMoves(int[] source, int[] target) {
    int x = source[0]-target[0];
    int y = source[1]-target[1];
    x=Math.abs(x);
    y=Math.abs(y);
    if(x == 0 && y == 0)
    {
        return 0;
    }
    else if(x == y||x == 0||y == 0)
    {
        return 1;
    }
    else
    {
        return 2;
    }
    
    }
}