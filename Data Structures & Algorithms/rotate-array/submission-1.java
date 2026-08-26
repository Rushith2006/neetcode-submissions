class Solution {
    void swap(int[]a ,int l,int r)
    {
        while(l<r)
        {
            int t  = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
       
    }
}