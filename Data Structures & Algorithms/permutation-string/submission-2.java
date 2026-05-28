class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String s1String = new String(s1Array);

        for(int i=0; i<s2.length(); i++){
            for(int j=i; j<s2.length(); j++){
                char[] s2Array = s2.substring(i,j+1).toCharArray();
                Arrays.sort(s2Array);
                String s2String = new String(s2Array);

                if(s1String.equals(s2String)) return true;
            }
        }
        return false;
    }
}
