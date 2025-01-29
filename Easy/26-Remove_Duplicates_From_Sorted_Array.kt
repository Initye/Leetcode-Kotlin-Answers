class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var numbers = mutableListOf<Int>() //We are using numbers to keep track of the elements that we already met.
        var index = 0 //Pointer index to track position of where next element should be placed

        for(i in 0 until nums.size) {
            if(nums[i] in numbers) { //In the loop we check if we encountered that element:
                continue //If yes then continue.
            } else { //if no then add it to numbers and place it at the next available position in the nums.
                numbers.add(nums[i])
                nums[index] = nums[i]
                index++
            }
        }
        return index //We return index that represents the number of unique elements in the array.
    }
}