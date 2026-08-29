class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0;
        int r=arr.length-1;
        while(r-l+1>k){
        int ldiff = Math.abs(x-arr[l]);
        int rdiff = Math.abs(x-arr[r]);
        if(ldiff>rdiff)
        {
            l++;
        }
        else
        {
            r--;
        }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=l;i<l+k;i++)
        {
            ans.add(arr[i]);
        }
        return ans;
    }
}