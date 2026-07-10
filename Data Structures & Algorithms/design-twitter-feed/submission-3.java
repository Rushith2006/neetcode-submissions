
class Twitter {

    private int time;

    class Tweet {
        int id;
        int time;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    HashMap<Integer, HashSet<Integer>> foll;
    HashMap<Integer, List<Tweet>> t;

    public Twitter() {
        time = 0;
        foll = new HashMap<>();
        t = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

        t.putIfAbsent(userId, new ArrayList<>());
        t.get(userId).add(new Tweet(tweetId, time++));

    }

    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<Tweet> maxh =
                new PriorityQueue<>((a, b) -> b.time - a.time);

        // Add user's own tweets
        if (t.containsKey(userId)) {
            for (Tweet te : t.get(userId)) {
                maxh.offer(te);
            }
        }

        // Add followed users' tweets
        if (foll.containsKey(userId)) {

            for (int fo : foll.get(userId)) {

                if (t.containsKey(fo)) {

                    for (Tweet te : t.get(fo)) {
                        maxh.offer(te);
                    }
                }
            }
        }

        List<Integer> res = new ArrayList<>();

        while (!maxh.isEmpty() && res.size() < 10) {
            res.add(maxh.poll().id);
        }

        return res;
    }

    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId)
            return;

        foll.putIfAbsent(followerId, new HashSet<>());
        foll.get(followerId).add(followeeId);

    }

    public void unfollow(int followerId, int followeeId) {

        if (foll.containsKey(followerId)) {
            foll.get(followerId).remove(followeeId);
        }
    }
}