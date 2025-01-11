class Solution {
    fun canConstruct(s: String, k: Int): Boolean {
        val charFrequency = IntArray(26)
        
        //Count character frequencies
        for (char in s){ 
            charFrequency[char - 'a']++
        }

        //Count odd frequency characters
        val oddCount = charFrequency.count {it % 2 != 0 }
        
        // If the string length is less than k, it's impossible to construct palindromes
        if (s.length < k) return false
        if (s.length == k) return true
        // If the number of odd-frequency characters is less than or equal to k,
        return oddCount <= k
    }
}