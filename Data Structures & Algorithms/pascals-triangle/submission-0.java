class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> ans = new ArrayList<>();
            for(int j =0;j<i+1;j++)
            {
                if(j==0 ||j==i)
                {
                    ans.add(1);
                }
                else
                {
                    ans.add((l.get(i-1).get(j-1))+(l.get(i-1).get(j)));
                }
            }
            l.add(ans);
        }
        return l;
    }
}