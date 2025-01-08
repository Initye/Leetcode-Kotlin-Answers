class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var count = 0
        for(i in 0 until words.size) {
            for(j in i + 1 until words.size){
                if (i != j && isPrefixAndSuffix(words[i], words[j])) {
                    count++
                }
            }
        }
        return count 
    }

    private fun isPrefixAndSuffix(prefix: String, suffix: String):Boolean {
         return suffix.startsWith(prefix) && suffix.endsWith(prefix)
    }
    
}