class Solution {
    public String minWindow(String s, String t) {
        if(s.isEmpty() || t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        for(char c: t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }

        int windowStart = -1, windowEnd = -1;
        int resLen = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
            Map<Character, Integer> countS = new HashMap<>();

            for(int j=i; j<s.length(); j++){
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j),0)+1);
                boolean flag = true;

                for(char c : countT.keySet()){
                    if(countS.getOrDefault(c,0) < countT.get(c)){
                        flag = false;
                        break;
                    }
                }

                if(flag && (j-i+1) < resLen){
                    resLen = j-i+1;
                    windowStart = i;
                    windowEnd = j;
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(windowStart, windowEnd+1);
    }
}
