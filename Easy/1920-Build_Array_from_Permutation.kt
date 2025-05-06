class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val ans = mutableListOf<Int>() //Initialize the list to store the result
        for(i in 0 until nums.size){ //Iterate once
            ans.add(nums[nums[i]]) //Add the value at the index
        }
        return ans.toIntArray() //Convert to an IntArray and return it
    }
}

// For people that don't even understand the problem:

// Let's say that we have an array: nums = [3, 0, 2, 1]
// We want to get nums[0] which is equal to 3, then if we get a nums[nums[0]] our nums inside of it is equal to 3, so we're left with nums[3] which is equal to 1 in our array. We have to do this with every next element, let's do one more:
// nums[1] = 0 nums[nums[1]] = nums[0] = 3

// So the result would be: [1, 3, ..., ...]