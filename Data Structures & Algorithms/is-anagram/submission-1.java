class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sNew = s.toCharArray();
        char[] tNew = t.toCharArray();

        Arrays.sort(sNew);
        Arrays.sort(tNew);
        return Arrays.equals(sNew,tNew);
    }
}
