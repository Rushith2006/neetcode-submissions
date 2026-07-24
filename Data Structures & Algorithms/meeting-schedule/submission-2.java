class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        int i = 0;
        int n = intervals.size();

        while (i + 1 < n) {

            if (intervals.get(i).end > intervals.get(i + 1).start) {
                return false;
            }

            i++;
        }

        return true;
    }
}