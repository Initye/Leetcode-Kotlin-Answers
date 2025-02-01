class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        if(nums.size == 1) return true //If the size of IntArray is 1 then return true
        //Loop until size - 1 so we don't go out of bounds
        for(i in 0 until nums.size - 1) {
            //Compare elements parity
            if((nums[i] % 2 == 0) == (nums[i+1] % 2 == 0)) {
                return false //If adjacent numbers have the same parity
            } 
        }
        return true //If no adjacent numbers share same parity
    }
}
```