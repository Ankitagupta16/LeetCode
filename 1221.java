//Solution 1

class Solution {
    public int balancedStringSplit(String s) {
      int  count =0;
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
                x++;
            else
                y++;
            if(x==y)
            {
                count++;
                x=0;y=0;
            }
        }
        return count;
    }
}


//Solution 2
class Solution {
   public int balancedStringSplit(String s) {
    int res = 0, cnt = 0;
    for (int i = 0; i < s.length(); ++i) {
        cnt += s.charAt(i) == 'L' ? 1 : -1;
        if (cnt == 0) ++res;
    }
    return res;             
}    
}
