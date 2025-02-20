class Solution {
    fun findDifferentBinaryString(nums: Array<String>): String {
        val answer = StringBuilder() //Initialize StringBuilder to store our answer.
      
        for(i in nums.indices) { //Iterate through strings
             answer.append(if (nums[i][i] == '0') '1' else '0') //Append to StringBuilder, explained below
        }
        
        return answer.toString() //Return answer
    }
}


//Iterate throught nums and take $$nums[i][i]$$ which means that we are taking one character from one indice. 
// For example: `"101", "001", "111"` 
// - Start at index 0 -> take 1
// - Move to index 1 -> take 0
// - Move to index 2 -> take 1 