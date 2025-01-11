class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = "" //We make a result var to store letters.
        val minLength = minOf(word1.length, word2.length) //We check the length of both strings, to loop through indices that exist in both strings.
        for (i in 0 until minLength) { //We add indices to result one by one until reaching the end of one string.
            result += word1[i]
            result += word2[i]
        }

        if (word1.length > minLength) { //We add the rest of indices to result using substring and minLength as a argument.
            result += word1.substring(minLength)
        } else {
            result += word2.substring(minLength)
        }

    return result
    }
}


// DIFFERENT SOLUTION TO THE SAME PROBLEM (IT HAS SLIGHTLY BETTER EFFICIENCY)
class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = StringBuilder() //We make a result var to store letters.
        val minLength = minOf(word1.length, word2.length) //We check the length of both strings, to loop through indices that exist in both strings.
        for (i in 0 until minLength) { //We add indices to result one by one until reaching the end of one string.
            result.append(word1[i])
            result.append(word2[i])
        }

        if (word1.length > minLength) { //We add the rest of indices to result using substring and minLength as a argument.
            result.append(word1.substring(minLength))
        } else {
            result.append(word2.substring(minLength))
        }

    return result.toString() //we are doing this because StringBuilder =/= String. StringBuilder is mutable, whereas String is immutable.
    }
}