class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int y = 0;
        while(temp>0){
            y = y*10 + temp%10;
            temp /= 10;
        }
        return y==x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna