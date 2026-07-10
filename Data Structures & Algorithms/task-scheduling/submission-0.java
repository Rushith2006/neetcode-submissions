class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f = new int[26];
        for(char c : tasks)
        {
            f[c - 'A']++;
        }
        Arrays.sort(f);
        int maxl = f[25]-1;
        int slots = maxl * n;
        for(int i=24;i>=0;i--)
        {
            slots -=Math.min(f[i],maxl);
        }

        return (slots>0) ? slots+tasks.length : tasks.length;
    }
}
