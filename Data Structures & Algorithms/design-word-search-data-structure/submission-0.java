class WordDictionary {
     class TrieNode
     {
        TrieNode[] child = new TrieNode[26];
        boolean end = false;
     }
     TrieNode root;
    public WordDictionary() {
          root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray())
        {
            int id = c - 'a';
            if(node.child[id]==null)
            {
                node.child[id] = new TrieNode();
            }
            node = node.child[id];
        }
        node.end = true;
    }

    public boolean search(String word) {
           return dfs(word,0,root);
    }
    boolean dfs(String word,int index,TrieNode node)
    {
        if(node == null)
        {
            return false;
        }
        if(index == word.length())
        {
            return node.end;
        }
        char c = word.charAt(index);
        if(c=='.')
        {
            for(int i = 0;i<26;i++)
            {
                if(dfs(word,index+1,node.child[i]))
                {
                    return true;
                }
            }
            return false;
        }
        return dfs(word,index+1,node.child[c-'a']);

    }
}
