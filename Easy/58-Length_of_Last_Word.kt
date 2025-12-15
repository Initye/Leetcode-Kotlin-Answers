class Solution {
    fun lengthOfLastWord(s: String): Int { 
        //Trim removes whitespaces "     word     "
        //Split cuts the string into pieces, "Hello World" = ["Hello", "World"]
        //Last gets the last word in the array
        val x = s.trim().split(" ").last() 

        val counted = x.count() //Counting the characters in the word
        
        return counted //Returning the value of the 'counted'
    }
}



//Solution without the split() and last() 
class Solution {
    fun lengthOfLastWord(s: String): Int { 
        var counted = 0 
        val trimmed = s.trim() //Trim creates new string so assign it to new val
        for (i in trimmed.length - 1 downTo 0) { //Count from the end until i is 0
            if (trimmed[i].isLetter()) { //If the 'i' is a letter then count
                counted += 1 
            }
            else { //Break if the 'i' is not a letter
                break
            }
        } 
        return counted //Returning the value of the 'counted'
    }
}