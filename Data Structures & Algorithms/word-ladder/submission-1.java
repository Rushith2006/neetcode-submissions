class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)|| beginWord.equals(endWord))
        {
            return 0;
        }
        HashSet<String> map = new HashSet<>(wordList);
        Queue<String> q  = new LinkedList<>();
        q.add(beginWord);
        int res=0;
        while(!q.isEmpty())
        {
            res++;
            
            for(int i = q.size();i>0;i--)
            {
                String node = q.poll();

                if(node.equals(endWord))
                {
                    return res;
                }
                for(int j =0;j<node.length();j++)
                {
                for(char c = 'a';c<='z';c++)
                {
                    if(c == node.charAt(j) ){
                      continue;
                    }

                      String nei = node.substring(0,j) + c + node.substring(j+1);

                      if(map.contains(nei))
                      {
                        q.add(nei);
                        map.remove(nei);
                      }
                }
                }
            }
        }
        return 0;
    }
}
