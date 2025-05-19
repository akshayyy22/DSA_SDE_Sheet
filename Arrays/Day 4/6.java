class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right = 0;
        int maxlength = 0;
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        
        while(right < n){
            if(mpp.containsKey(s.charAt(right))){
                left = Math.max(mpp.get(s.charAt(right)) + 1 , left);
            }
            mpp.put(s.charAt(right) , right);
            maxlength = Math.max(right - left + 1 , maxlength);
            right++;
        }
        return  maxlength;
    }
}