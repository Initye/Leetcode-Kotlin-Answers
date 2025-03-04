class Solution {
    fun checkPowersOfThree(n: Int): Boolean {
        var p = n
        val ternary = StringBuilder() //Create a String to hold ternary

        while(p > 0) { 
            val remainder = p % 3 //Get the remainder of dividing
            ternary.append(remainder) //Store remainder
            p /= 3 //Reduce the number by dividing by 3
        }

        for(i in 0 until ternary.length) { //Go through our ternary
           if(ternary[i] > '1') { //If any number is above 1, e.g. 102 then its false, else true
                return false
           } 
        }
        return true
    }
}