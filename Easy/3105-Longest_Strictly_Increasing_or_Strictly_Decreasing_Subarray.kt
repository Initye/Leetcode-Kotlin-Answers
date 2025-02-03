class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
       var maxLength = 1
       var incLength = 1 //Length of increasing subarray
       var decLength = 1 //Length of decreasing subarray

       for(i in 0 until nums.size - 1) { 
             if(nums[i + 1] > nums[i]) { //Increasing sequence
                incLength++
                decLength = 1 // Reset decLength as the trend changed
            } else if(nums[i + 1] < nums[i]) { // Decreasing sequence
                decLength++
                incLength = 1
            } else { //Equal elements
                incLength = 1
                decLength = 1
            }
             // Update the maximum length of the increasing subarray
            maxLength = maxOf(maxLength, maxOf(incLength, decLength))
            }
               return maxLength
    }
}
