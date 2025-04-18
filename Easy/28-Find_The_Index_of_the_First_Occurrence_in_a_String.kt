class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length > haystack.length) return -1
        
        //So we dont go over the bounds
        for(i in 0..haystack.length - needle.length) {
            //We extract a part of a string using start index and end index.
            if(haystack.substring(i, i + needle.length) == needle) return i
        }
        return -1
    }
}