class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val frequencyMap = HashMap<Int, Int>()
        var repeated = 0
        var sum = 0

        for (row in grid) {
            for (num in row) {
                sum += num //Counts sum
                frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
                if(frequencyMap[num] == 2) { //Checks for repeated number 
                    repeated = num
                }
            }
        }

        val n = grid.size
        //Because we have n^2 in the problem we cant use n*(n+1)/2 to find the sum
        val totalSum = (n * n * (n * n + 1 )) / 2 
        //Checking for missing integer
        val missing = totalSum - (sum - repeated)
        

        return intArrayOf(repeated, missing)
    }
}