class Solution {
    fun minimumLength(s: String): Int {
        val charFrequency = IntArray(26) //Iterate through each character and count how many times each one reoccurs
        for (char in s) {
            charFrequency[char - 'a']++
        }
        var result = s.length //Store the length of s string

        while(true) { //Create loop so we don't stop executing the process after deleting character only once
        var changes = false //Set it to false at the start

            for (i in 0 until 26){ 
                if (charFrequency[i] >= 3) { //Execute the loop while charFrequency of at least one character is still higher or equal to 3. 
                    charFrequency[i] -= 2 //Change the number of reoccurs in charFrequency without changing the string itself
                    result -= 2 //Change the length of the string
                    changes = true //Make changes true so the loop repeats
                }
            }

            if(changes != true) { //If no changes were made the loop is no longer set to true, that way we stop executing it.
                break
            }
        }
        return result //Return the length of the string after deleting characters. 
    }
}
