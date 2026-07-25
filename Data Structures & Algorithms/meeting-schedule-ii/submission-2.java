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
        if(intervals.size()==0) return 0;
        int min= Integer.MAX_VALUE;
        for(Interval i:intervals){
            max= Math.max(max,i.end);
            min= Math.min(min,i.start);
        }
        int arr[]= new int[max+1];
        for(Interval i:intervals){
           int s= i.start, e= i.end;
           arr[s]++;
           if(e+1<arr.length) arr[e]--;
        }
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]+= arr[i-1];
            ans= Math.max(ans,arr[i]);
        }
        return ans;
    }
}
