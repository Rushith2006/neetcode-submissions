class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] s = path.split("/");

        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals("") || s[i].equals("."))
            {
                continue;
            }
            else if(s[i].equals("..")){
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else
            {
                st.push(s[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str : st)
        {
            sb.append("/").append(str);
        }
        return sb.length() ==0 ? "/" : sb.toString();

    }
}