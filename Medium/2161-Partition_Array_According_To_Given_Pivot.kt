//O(1) SPACE SOLUTION 

class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val result = IntArray(nums.size) //Initialize result
        var left = 0 //To count placing of elements
        var pivots = 0 //To count occurencies of pivot in an array

        for(i in 0 until nums.size) {
            if(nums[i] < pivot) { result[left++] = nums[i]} //If the current element is less than pivot, add it to the result and increment left so that we dont override
            else if(nums[i] == pivot) { pivots++ } //If the current element is equal to pivot, increment the count of pivots
        }

        repeat(pivots) { result[left++] = pivot } //After selecting elements that are less than our pivot, add as many to the result pivots as we counted

        for(i in 0 until nums.size) { 
            if(nums[i] > pivot) { result[left++] = nums[i]}//If the current element is more than pivot, add it to the result and increment left so that we dont override
        }

        return result //Return result
    }
}

//O(n) SPACE SOLUTION

class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val less =  mutableListOf<Int>() //Store elements that are less then pivot 
        val more =  mutableListOf<Int>() //Store elements that are more than pivot
        val equal = mutableListOf<Int>() //Store elements that are equal to the pivot

        for(i in 0 until nums.size) {
            if(nums[i] > pivot) {
                more.add(nums[i]) //If current element is bigger than pivot, add it to the `more` list
            }
            if(nums[i] < pivot) {
                less.add(nums[i]) //If current element is less than pivot, add it to the `less` list
            }
            if(nums[i] == pivot) {
                equal.add(nums[i]) //If current element is equal than pivot, add it to the `equal` list
            }
        }

        val result = less + equal + more //Combine all lists to one
        return result.toIntArray() //Return the result
    }
}
