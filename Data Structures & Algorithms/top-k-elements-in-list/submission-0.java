class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Bucket array
        List<Integer>[] b = new ArrayList[nums.length + 1];

        // Count frequencies
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Put numbers into buckets
        for (int s : map.keySet()) {

            int f = map.get(s);   // FIX: map.key(s) -> map.get(s)

            if (b[f] == null) {
                b[f] = new ArrayList<>();
            }

            b[f].add(s);          // FIX: missing semicolon
        }

        int[] r = new int[k];
        int id = 0;

        // Traverse buckets from highest frequency
        for (int i = b.length - 1; i >= 0 && id < k; i--) {   // FIX: for loop condition

            if (b[i] != null) {   // FIX: b[i]=!null -> b[i] != null

                for (int num : b[i]) {

                    r[id++] = num;    // FIX: nums -> num

                    if (id == k) {
                        break;
                    }
                }
            }
        }

        return r;
    }
}