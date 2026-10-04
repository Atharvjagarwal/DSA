class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0;i<haystack.length()-needle.length()+1 ; i++) {
           if(haystack.charAt(i)==needle.charAt(0)){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
           }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna