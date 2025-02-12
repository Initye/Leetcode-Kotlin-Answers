class Solution {
    fun maximumSum(nums: IntArray): Int {
        var result = -1 //Result -1 when no valid pair is found
        var max = IntArray(82) //Bcs constraints (0 - 81)

        for(num in nums) { 
            val digits = num.toString().sumOf { it - '0'} //Sum of digits of current number
            if(max[digits] > 0) { //If theres a number with the same sum of digits
                result = maxOf(result, num + max[digits]) //Update the result with highest value
            }
            max[digits] = maxOf(max[digits], num) //Store the highest number for the current sum of digits
        }
        return result
    }
}



//REALLY SLOW SOLUTION REALLY REALLY
class Solution {
    fun maximumSum(nums: IntArray): Int {
        var result = -1 //To return -1 if there is no valid parts
        
        for(i in 0 until nums.size) {
            for(j in i + 1 until nums.size) {
                    val firstResult = nums[i].toString().sumOf { it - '0' } //Add digits of first integer  
                    val secondResult = nums[j].toString().sumOf { it - '0' }  //Add digits of second integer

                    if(firstResult == secondResult) { 
                        result = maxOf(result, nums[i] + nums[j]) //Update the result if we have bigger value
                }
            }
        }
        return result 
        
    }
}


//nums[i].toString().sumOf { it - '0' }
// How this works is that it:
// -Converts our integer to string
// -Get a sum of elements inside of string (where for example we have 43,
// so it takes '4' - '0' = 4 and then '3' - '0' = 3
// -sumOf sums those 2 numbers that we calculated so it becomes 4 + 3 = 7