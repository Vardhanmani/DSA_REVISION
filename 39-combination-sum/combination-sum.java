class Solution {
    public static void backtracking(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // choice
            current.add(candidates[i]);
            // recursion
            backtracking(candidates, target - candidates[i], i, current, result);
            // undo
            current.remove(current.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
}