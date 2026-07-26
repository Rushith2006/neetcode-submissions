class Solution {
    public int[] plusOne(int[] digits) {
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<digits.length;i++)
         {
            sb.append(digits[i]);
         }
         String s = sb.toString();
        long n = Long.parseLong(s);
        n = n + 1;

        String ans = String.valueOf(n);

        int[] res = new int[ans.length()];

        for (int i = 0; i < ans.length(); i++) {
            res[i] = ans.charAt(i) - '0';
        }

        return res;
    }
}
