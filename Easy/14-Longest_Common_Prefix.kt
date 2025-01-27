class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = strs[0] //Set first string as common prefix.

        for (i in 1 until strs.size) {
            while(!strs[i].startsWith(prefix)) { //Iterate through string, check if elements start with the our current prefix. If yes - continue
                prefix = prefix.dropLast(1) //If no - shorten the prefix by removing last character
                if (prefix.isEmpty()) return "" //If our prefix becomes empty, return "" since there is no common prefix.
            }
        }
        return prefix //Return the result.
    }
}