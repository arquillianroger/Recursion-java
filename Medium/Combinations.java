// Backtracking : O(C(n,k) * k) (there are C(n,k) cominations, copying each costs O(k))
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        subsetsOfSizeK(1, n, k, new ArrayList<>(), result);
        return result;
    }
    void subsetsOfSizeK(int start, int n, int k, List<Integer> curr, List<List<Integer>> result) {
        // Base Case
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i <= n; i++){
            curr.add(i);
            
            // Recursive Call
            subsetsOfSizeK(i + 1, n, k, curr, result);

            // Backtrack
            curr.remove(curr.size() - 1);
        }
    }
}
