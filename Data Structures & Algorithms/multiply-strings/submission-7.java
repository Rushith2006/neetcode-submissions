class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        if(num1.equals("0")||num2.equals("0"))
        {
            return "0";
        }
        int res[] = new int[n1+n2];
        for(int i=n1-1;i>=0;i--)
        {
            for(int j=n2-1;j>=0;j--)
            {
                int a = num1.charAt(i)-'0';
                int b = num2.charAt(j)-'0';
                int sum= a*b +res[i+j+1];
                res[i+j+1] = sum%10;
                res[i+j] += sum/10; 
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x : res)
        {
            if (sb.length() == 0 && x == 0) {
              continue;
            }
            sb.append(x);
        }
        return sb.toString();
    }
}
