class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var count = 0
        for(i in 0 until words.size) { //Iterate through words array.
            if(words[i].startsWith(pref)) { //Use startsWith method (kotlin) to check if current word contains that prefix.
                count++ //If it does, increment count.
           }
        }
        return count //Once the loop is done, return count.
    }
}

