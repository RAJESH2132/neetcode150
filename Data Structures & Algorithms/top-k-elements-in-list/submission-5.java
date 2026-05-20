class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = buckets.length-1; i>=0 && index<k; i--){
            for (int num : buckets[i]) {
                result[index] = num;
                index++;
                if (index == k) break;
            }
        }
        return result;
    }
}
