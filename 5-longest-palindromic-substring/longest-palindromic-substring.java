class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int max = 0, start = 0, end = 0;

        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){

                if(isPalindrome(s,i,j) == true){
                    if(j-i+1 > max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna