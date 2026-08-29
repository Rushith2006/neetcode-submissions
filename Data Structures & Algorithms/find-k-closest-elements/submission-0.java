class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    Map<Integer,List<Integer>> hm =new HashMap<>();
    for(int i:arr){
        int diff= Math.abs(x-i);
        if(hm.containsKey(diff)) hm.get(diff).add(i);
        else {
            hm.put(diff,new ArrayList());
            hm.get(diff).add(i);
        }
    }
    List<Integer> ans= new ArrayList();
    int a=0;
    while(ans.size()<k){
        if(hm.containsKey(a)) {
            List<Integer> temp= hm.get(a);
            for(int i=0;i<temp.size() && ans.size()<k;i++) ans.add(temp.get(i));
        }
        a++;
    }
    Collections.sort(ans);
    return ans;
    }
}