import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if (dup.contains(nums[i])){
                return true;
            }
            dup.add(nums[i]);
        }
        return false;
    }
}
