class Solution {
    public String foreignDictionary(String[] words) {
      HashMap<Character , List<Character>> map =new HashMap<>();
      HashMap<Character,Integer> in = new HashMap<>();

      for(String word : words)
      {
        for(char c : word.toCharArray())
        {
            map.putIfAbsent(c,new ArrayList<>());
            in.putIfAbsent(c,0);
        }
      }
      for(int i=0;i < words.length - 1;i++)
      {
        String word1 = words[i];
        String word2 = words[i+1];

        if(word1.length()>word2.length() && word1.startsWith(word2))
        {
            return "";
        }
        int len = Math.min(word1.length(),word2.length());
        for(int j=0;j<len;j++)
        {
            char c1 = word1.charAt(j);
            char c2 = word2.charAt(j);

            if(c1!=c2)
            {
                if(!map.get(c1).contains(c2))
                {
                    map.get(c1).add(c2);
                    in.put(c2,in.get(c2)+1);
                }
                 break;
            }
           
        }
      }
      Queue<Character> q = new LinkedList<>();
      for(char c : in.keySet())
      {
        if(in.get(c)==0)
        {
            q.add(c);
        }
      }
      StringBuilder res= new StringBuilder();
      while(!q.isEmpty())
      {
        char c = q.poll();
        res.append(c);

        for(char ne : map.get(c))
        {
            in.put(ne, in.get(ne)-1);
            if(in.get(ne)==0)
            {
                q.add(ne);
            }
        }

      }
      if(res.length()!=in.size())
      {
        return "";
      }
      return res.toString();

    }
}
