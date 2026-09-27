class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        for(int i = 0; i<t.length(); i++){
            freq[t.charAt(i)]++;
        }


        int reqL = t.length();
        int left = 0;
        int start = 0;
        int minL = Integer.MAX_VALUE;

        for(int right = 0; right<s.length(); right++){
            char r = s.charAt(right);
            if(freq[r]>0){
                reqL--;
            }
            freq[r]--;

            while(reqL == 0){
                if(right-left+1 < minL){
                    minL = right-left+1;
                    start = left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]> 0){
                    reqL++;
                }
                left++;
            }
        } 
        if(minL == Integer.MAX_VALUE){
            return "";
        }else 
            return s.substring(start, start + minL);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna