class Solution {

    public boolean isAnagram(String str1, String str2){
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1,char2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i=0; i<strs.length; i++){
            if(visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;

            for(int j=i+1; j<strs.length; j++){
                if(!visited[j] && isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }
}
