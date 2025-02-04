class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        var sum = nums[0] 
        var maxSum = nums[0] //keep track of max ascending subarray

        for(i in 1..<nums.size) {
            if(nums[i] > nums[i - 1]) { //If current element greater than previous one, continue
                sum += nums[i] //add nums[i] to sum
            } else { //if sequence breaks reset sum to current element
                sum = nums[i] 
            }
            maxSum = maxOf(maxSum, sum) //store highest sum encountered so far
        }
        return maxSum //return maxSum
    }
}



//Crazy solution (don't use it it's more to show that it can be done differently )


class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        var seq = mutableListOf<Int>()
        var maxSeq = mutableListOf<Int>()

        
        for(i in nums.indices) {
            if(i == 0 || nums[i] > nums[i - 1]) { 
                seq.add(nums[i]) //Start or continue ascending sequence
            } else{ //if sequence breaks
                if(seq.sum() > maxSeq.sum()) { //compare sums
                    maxSeq = seq
                }
                seq = mutableListOf(nums[i]) //Start new sequence
            }
        }

        if (seq.sum() > maxSeq.sum()) {
            maxSeq = seq
        }

        return maxSeq.sum()
    }
}