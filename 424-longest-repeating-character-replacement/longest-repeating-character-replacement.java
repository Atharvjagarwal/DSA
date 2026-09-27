class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[256];
        int left = 0;
        int maxF = 0;
        int maxL = 0;

        for(int right = 0; right<s.length(); right++){
            char R = s.charAt(right);
            freq[R]++;

            maxF = Math.max(maxF, freq[R]);
            
            int windowL = right-left+1;

            if(windowL - maxF > k){
                char L = s.charAt(left);
                freq[L]--;
                left++;
            }
            windowL = right-left+1;

            maxL = Math.max(maxL, windowL);
        }
        return maxL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna