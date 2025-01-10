 class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false //palindrome is not existing if its lower than 0
        val revNum = x.reverse() //using the reverse function
        if(x == revNum) { //if our number is palindrome return true, else false 
            return true
        } else {
            return false
        }
    }

fun Int.reverse(): Int {
    var n = this //refers to an integer value in the class 
    var result = 0
    while (n > 0) { //the loop processes all digits until n == 0.
        result = 10 * result + n % 10 //n % 10 extracts last digit of n and 10 * result moves current result one digit to left (example: if n = 123 then n % 10 = 3, so when result = 0 after the iteration it becomes 3). 
        n = n / 10 //Removing last digit from an n
    }
    return result //Returning the value 
    }
}


//A solution by making the (x) a string and reversing it
class Solution {
    fun isPalindrome(x: Int): Boolean { 
        if (x < 0) return false //palindrome is not existing if its lower than 0
        val reversed = stringReverse(x) //Assigning result of stringReverse function to an val
        if (x == reversed) { //if our number is palindrome return true, else false 
            return true 
        }else {
            return false
        }
    }

    fun stringReverse(x: Int): Int { //Function To reverse int
        var revStringNum = x.toString().removePrefix("-").reversed() //Changing type to String, removing Prefix, reversing string
        var revNum = revStringNum.toInt() //Changing back to int
        return revNum //Returning the value 
    }
}