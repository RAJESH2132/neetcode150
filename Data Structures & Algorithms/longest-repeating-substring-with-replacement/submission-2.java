class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, right = 0;
        int maxFreq = 0, maxLength = 0;

        while(right < s.length()){
            int index = s.charAt(right)-'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);

            while((right-left+1)-maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
