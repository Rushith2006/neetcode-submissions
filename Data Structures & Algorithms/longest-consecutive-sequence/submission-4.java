class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {

            // Start only if there is no previous consecutive number
            if (!set.contains(num - 1)) {

                
                int length = 1;

                while (set.contains(num + 1)) {
                    num++;
                    length++;
                }

                max = Math.max(max, length);
            }
        }

        return max;
    }
}