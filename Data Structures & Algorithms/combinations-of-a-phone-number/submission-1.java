class Solution {
    HashMap<Character,String> map;
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        map  = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> ans = new ArrayList<>();
        dfs(0,n,digits,new StringBuilder(),ans);
        return ans;
    }
    public void dfs(int i,int n,String digits,StringBuilder sb,List<String> ans)
    {
        if(i == n)
        {
            String s = sb.toString();
            if(s.length()!=0) ans.add(s);
            return;
        }
        if(digits.charAt(i)<=1) return;

        String c = map.get(digits.charAt(i));
        for(int index = 0;index<c.length();index++)
        {
            sb.append(c.charAt(index));
            dfs(i+1,n,digits,sb,ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
