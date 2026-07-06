class TimeMap {

    static class pair
    {
        String value;
        int t ;
        pair(String value,int t)
        {
            this.value = value;
            this.t = t;
        }
    }
    HashMap<String,ArrayList<pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }
        ArrayList<pair> list = map.get(key);
        int l =0;
        int r =list.size()-1;
        String ans = "";
        while(l<=r)
        {
            int mid = l + (r - l)/2;
            if(list.get(mid).t<=timestamp)
            {
                ans = list.get(mid).value;
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return ans;

    }
}
