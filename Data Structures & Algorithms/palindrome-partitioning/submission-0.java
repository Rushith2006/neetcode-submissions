class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        bk(0,s,temp,ans);
        return ans;
    }
    public void bk(int index,String s,List<String> temp,List<List<String>> ans)
    {
        if(index == s.length() )
        {
            ans.add(new ArrayList<>(temp));
        }
        for(int i = index;i<s.length();i++)
        {
            String sub = s.substring(index,i+1);
            if(pl(sub))
            {
                temp.add(sub);
                bk(i+1,s,temp,ans);
                temp.remove(temp.size() - 1);
            }
        }
    }
    boolean pl(String s)
    {
        int l =0;
        int r = s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
