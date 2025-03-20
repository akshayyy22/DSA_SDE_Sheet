class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer , Integer> mpp = new HashMap<>();
        int result = 0;
        for(int num : nums){
            mpp.put(num , mpp.getOrDefault(num , 0) + 1);
        }

        for(int key : mpp.keySet()){
            if(mpp.get(key) == 1){
                result = key;
            }
        }
        return result;
    }
}