class Solution {
    HashMap<Character,String> hm;
    void go(int i,int n,String dig, StringBuilder sb,List<String> ans){
        if(i==n) {
            String s= sb.toString();
           if(s.length()!=0) ans.add(s);
            return;
        }
        if(dig.charAt(i)<='1') return;
       String c=  hm.get(dig.charAt(i));
       for(int ind=0;ind<c.length();ind++){
        sb.append(c.charAt(ind));
        go(i+1,n,dig,sb,ans);
        sb.deleteCharAt(sb.length()-1);
       }
    }
    public List<String> letterCombinations(String digits) {
        hm= new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        List<String> ans= new ArrayList<>();
        go(0,digits.length(),digits,new StringBuilder(),ans);
        return ans;
    }
}
