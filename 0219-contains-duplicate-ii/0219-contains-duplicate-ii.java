class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> set=new HashSet<>();
      int i = 0; // window start index

        for (int num : nums) {
            if (set.contains(num)) return true; // duplicate found
            set.add(num);

            // keep window size at most k
            if (set.size() > k) {
                set.remove(nums[i++]); // remove oldest element
            }
        }
        return false;   
    }
}