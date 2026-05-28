class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            int count = 0;
            int[] list = new int[26];
            for(int j=i; j<s.length(); j++){
                list[s.charAt(j)-'A']++;
                count = Math.max(count,list[s.charAt(j)-'A']);
                int changes = (j-i+1)-count;

                if(changes<=k){
                    maxLength = Math.max(maxLength, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
}
