class Solution {
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0)
            return output;
        findConbinationsSum(candidates, new ArrayList<>(), 0, target);
        return output;
    }

    public void findConbinationsSum(int[] candidates, List<Integer> tmp, int index, int sum) {
        if (index == candidates.length) {
            if (sum == 0) {
                output.add(new ArrayList<>(tmp));
            }
            return;
        }
        if (candidates[index] <= sum) {

            tmp.add(candidates[index]);
            findConbinationsSum(candidates, tmp, index, sum - candidates[index]);
            tmp.remove(tmp.size() - 1);
        }

        findConbinationsSum(candidates, tmp, index + 1, sum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna