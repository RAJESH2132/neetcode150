class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        List<Integer> numList = new ArrayList<>(freq.keySet());
        numList.sort((a,b)->freq.get(b)-freq.get(a));

        int[] result = new int[k];
        for(int i=0; i<k;i++){
            result[i]=numList.get(i);
        }
        return result;
    }
}
