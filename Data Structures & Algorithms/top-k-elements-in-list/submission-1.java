class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Add all unique numbers
        pq.addAll(map.keySet());

        int[] ans = new int[k];

        // Remove top k frequent elements
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}