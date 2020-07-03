class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result= new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            int x=i;
            while(x>0)
            {
                if(x%10==0 || i%(x%10)!=0)
                    break;
                x=x/10;
            }
            if(x==0)
                result.add(i);
        }
        return result;
    }
    
}
