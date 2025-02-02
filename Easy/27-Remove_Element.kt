class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        for(i in 0 until nums.size) { //Iterate through whole array
            if(nums[i] != `val`){ //If our current element does not have the same value of `val`
                nums[k] = nums[i] //We add to nums[k] the value of nums[i]
                k++ //Make new space for next element
            }
        }
        return k
    }
}