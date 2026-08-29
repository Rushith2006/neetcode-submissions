class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("D") || operations[i].equals("+") || operations[i].equals("C"))
            {
                if(operations[i].equals("D"))
                {
                    st.push(2*st.peek());
                }
                else if(operations[i].equals("+"))
                {
                    int a = st.pop();
                    int b = st.peek();
                    st.push(a);
                    st.push(a+b);
                }
                    
                else if(operations[i].equals("C"))
                {
                    st.pop();
                }
            }
            else
            {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int s=0;
        while(!st.isEmpty())
        {
            s+=st.pop();
        }
        return s;
    }
}