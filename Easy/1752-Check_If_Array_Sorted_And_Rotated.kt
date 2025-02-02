class Solution {
    fun check(nums: IntArray): Boolean {
        var count = 0
        for(i in 0 until nums.size) {
            if(nums[i] > nums[(i + 1) % nums.size]) { //compare 2 numbers nums[i] and nums[i+1] where modulo is to wrap array and go back to index[0]
                count += 1 
                if(count > 1) return false
            } 
        }
        return true
    }
}

//the solution is that there is only 1 place where larger number is followed by smaller one.