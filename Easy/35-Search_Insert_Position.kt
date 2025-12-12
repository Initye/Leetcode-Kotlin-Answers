class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) { 
          if (nums[i] >= target) { //If the current element is greater than or equal to the target, return the insertion index
            return i
          }     
        }
        return nums.size //If the target does not meet the above conditions return the size of the array since it has to be at the end
    }
}