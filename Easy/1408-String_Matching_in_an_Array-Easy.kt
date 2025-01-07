class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val n = words.size
        val result = mutableListOf<String>()// Result list to store substrings
        
        for(i in 0 until n) {
            for (j in 0 until n) {
                if(i != j && words[j].contains(words[i])) { // Check if words[i] is a substring of words[j]
                    result.add(words[i])
                    break 
                }
            }
        }
        return result
    }
}