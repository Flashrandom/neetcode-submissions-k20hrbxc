class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>(), target, 0);
        return result;
    }

    void backtrack(List<List<Integer>> result, int[] nums,
                   List<Integer> comb, int target, int i) {

        if (target == 0) {
            result.add(new ArrayList<>(comb));
            return;
        }

        if (i >= nums.length || target < 0) {
            return;
        }
        comb.add(nums[i]);
        backtrack(result, nums, comb, target - nums[i], i);

        comb.remove(comb.size() - 1);

        backtrack(result, nums, comb, target, i + 1);
    }
}