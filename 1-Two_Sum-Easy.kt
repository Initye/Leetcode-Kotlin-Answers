class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) { //going through nums on indexes 
            for (j in i + 1 until nums.size) { //j = i + 1 because we have to compare pairs, do it until reaching nums size
                if (nums[i] + nums[j] == target) { 
                     return intArrayOf(i, j) //stopping at first correct answer 
                }
            }
        }
        throw IllegalArgumentException("No solution")
    }
}