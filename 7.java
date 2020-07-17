class Solution {
    public int reverse(int x) {
        int r=0;
        while(x!=0)
        {
            int n=10*r+x%10;
            if( ( n - x % 10 ) / 10 != r)
                return 0;
            r=n;
            x/=10;
        }
        return r;
    }
}


