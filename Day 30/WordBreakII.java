package july2020;

import java.util.*;

public class WordBreakII {
	
	private Map<String, List<String>> map = new HashMap<>(); 
    public List<String> wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict);
    }
    
    private List<String> helper(String s, List<String> wordDict) {
        if(map.containsKey(s)) {
            return map.get(s);
        }
        List<String> res = new ArrayList<>();
        
        if(s.isEmpty()) {
            res.add(""); 
            return res;
        }
        List<String> tmp;
        for(String w: wordDict){
            if(s.startsWith(w)){
               tmp = helper(s.substring(w.length()), wordDict);
                for(String l: tmp) {
                    res.add(w+ (l.isEmpty()? "" :(" " + l)));
                } 
            }
        }
        map.put(s, res);
        return res;
    }

}
