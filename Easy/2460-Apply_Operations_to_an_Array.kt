class Solution {
    fun applyOperations(nums: IntArray): IntArray {
        val n = nums.size //size of the array
        var nonZero = 0 //track position for next nonzero element

        for(i in 0 until n - 1) {
            if(nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2 //multiply element by 2 
                nums[i + 1] = 0 //set element to 0
            }
        }

        for(i in 0 until n) {
             if(nums[i] != 0) { //check if current element is nonZero
                if(i != nonZero) { //swap if index i is different from nonZero index
                    nums[nonZero] = nums[i] //move nonzero element to the front 
                    nums[i] = 0 //set original position to 0
                }
                nonZero++ //increment to the next position available
            }
        }       
        return nums
    }
}