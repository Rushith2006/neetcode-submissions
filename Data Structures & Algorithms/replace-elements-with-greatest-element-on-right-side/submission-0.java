class Solution {
    public int[] replaceElements(int[] arr) {
       int max =0;
       int n=  arr.length;
       int a[]= new int[n];
       for(int i=n-1;i>=0;i--)
       {
        if(i==n-1)
        {
            max = Math.max(max,arr[i]);
            a[i] = -1;
        }
        else
        {
            
            a[i] = max;
            max = Math.max(max,arr[i]);
        }
       }
       return a;
    }
}