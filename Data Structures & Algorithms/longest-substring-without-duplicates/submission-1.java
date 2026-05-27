class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();

        for(int r=0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            result = Math.max(result, r-left+1);
        }
        return result;
    }
}
