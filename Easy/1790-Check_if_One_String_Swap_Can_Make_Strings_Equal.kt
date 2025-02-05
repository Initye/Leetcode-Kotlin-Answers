class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        if (s1.length != s2.length) return false //If strings are different lengths, they can't be almost equal
        var diff = mutableListOf<Int>() //Store indices where characters in s1 and s2 differ

        for(i in s1.indices) { //Iterate each character to find diff
            if(s1[i] != s2[i]) {
                diff.add(i) //Add mismatched characters
            }
        }
        
        when(diff.size) { //Check the number of differences
            0 -> return true //No differences, strings are equal
            2 -> { //Two differences check if swapping fixes the problem
                val (i, j) = diff //Assign value of indices i = [0], j = [1]
                return s1[i] == s2[j] && s1[j] == s2[i] //Check if swapping makes them equal
            } 
            else -> return false //More than 2 differences or exactly 1
        } 
    }
}
