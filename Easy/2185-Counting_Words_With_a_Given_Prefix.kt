class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var count = 0
        for(i in 0 until words.size) {
            if(words[i].startsWith(pref)) {
                count++ 
           }
        }
        return count
    }
}

