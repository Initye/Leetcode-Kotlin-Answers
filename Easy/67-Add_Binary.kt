class Solution {
    fun addBinary(a: String, b: String): String {
        val result = StringBuilder()
        var carry = 0
        //Start from the right of both strings
        var i = a.lastIndex
        var j = b.lastIndex
        //Continue while there are digits
        while (i >= 0 || j >= 0 || carry != 0) {
            var r = carry
            if (i >= 0) r += (if (a[i] == '1') 1 else 0)
            if (j >= 0) r += (if (b[j] == '1') 1 else 0)
            //Append bit of the sum (0 or 1)
            result.append(if (r%2==1) '1' else '0')

            carry = r / 2 //Calculate carry for the next iteration
            //Move to the next digit (to left)
            i-- 
            j--
        }
        
        return result.reverse().toString()
    }
}