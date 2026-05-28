class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];
        int window = s1.length();

        for(char c: s1.toCharArray()){
            s1Freq[c-'a']++;
        }

        for(int i=0; i<s2.length(); i++){
            windowFreq[s2.charAt(i)-'a']++;
    

            if(i>=window){
                windowFreq[s2.charAt(i-window)-'a']--;
            }

            if(Arrays.equals(s1Freq, windowFreq)){
                return true;
            }
        }
        return false;
    }
}
