class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val frequencyMap = mutableMapOf<Int, Int>()

        //Count frequency of numbers
        for (num in nums) {
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }


        for (count in frequencyMap.values) {
            if (count % 2 != 0) return false 
        } 
        return true
    }
}