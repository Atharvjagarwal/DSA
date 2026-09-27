class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int count = 0;
        int maxL = 0;

        for(int right = 0; right<s.length(); right++){
            char R = s.charAt(right);
            freq.merge(R, 1, Integer::sum);

            while(freq.get(R) >1){
                char L = s.charAt(left);
                freq.put(L, freq.get(L)-1);
                left++;
            }
            count = right-left+1;
            maxL = Math.max(maxL, count);
        }return maxL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna