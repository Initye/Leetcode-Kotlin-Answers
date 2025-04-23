class Solution {
    fun countLargestGroup(n: Int): Int {
        val map = mutableMapOf<Int, Int>()

        //Loop through all numbers 1 to n
        for (i in 1..n) {
            val sum = digitSum(i) //calculate digitsum of current i 
            map[sum] = map.getOrDefault(sum, 0) + 1 //update the count of this digit sum in the map
        }

        val max = map.values.maxOrNull() ?: 0 //find size of the largest group
        return map.values.count { it == max } //count how many groups have this size
    }

    //Function for returing the sum of digits
    private fun digitSum(num: Int): Int {
        var sum = 0
        var n = num
        while (n > 0) {
            sum += n % 10 //add last digit
            n /= 10 //remove last digit
        }
        return sum
    }
}
