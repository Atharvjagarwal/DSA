class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(!s.contains(n) && n!=1){
            s.add(n);
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna