/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int max=-1;
        int min=Integer.MAX_VALUE;
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        HashMap<Integer,Integer> he = new HashMap<>();
        for(Interval i:intervals)
        {
            min = Math.min(min,i.start);
            max = Math.max(max,i.end);
            hs.put(i.start,hs.getOrDefault(i.start,0)+1);
            he.put(i.end,he.getOrDefault(i.end,0)+1);

        }
        int r =0;
        int ans=0;
        for(int i=min;i<=max;i++)
        {
            r+=hs.getOrDefault(i,0);
            r-=he.getOrDefault(i,0);
            ans=Math.max(ans,r);
        }
        return ans;

    }
}
