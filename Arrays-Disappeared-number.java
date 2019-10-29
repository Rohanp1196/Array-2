// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i] != (i+1)){
                int prev = nums[i];
                while (prev != nums[prev-1]){ //Swapping 
                    int t = nums[prev-1];
                    nums[prev-1] = prev;
                    prev = t;
                }
            }
        
    }
        
          List<Integer> ans = new ArrayList<>(); //Adding the missing numbers to the list
        for (int i = 0; i < n; i++){
            if (nums[i] != (i+1)){
                ans.add(i+1);
            }
    }
        
        return ans; //Returning the list
    }
}   