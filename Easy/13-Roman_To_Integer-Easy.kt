class Solution {
    fun romanToInt(s: String): Int {
        val map: HashMap<Char, Int> = hashMapOf( //Creating a hashmap of roman numbers
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var result = 0 
        for (i in 0 until s.length) {  //iterate through string 
            val currentValue = map[s[i]] ?: 0  //assign value of hashmap for string
            val nextValue =  if (i + 1 < s.length) map[s[i + 1]] ?: 0 else 0 //check if there is next character, assing a value of hashmap for it, if there is no such character declared in map then 0, and if there is no next character then 0
        
        if (currentValue < nextValue) { //compare current value and next value, example: XIX, current = 10 next = 1, 10>1 so add to result, current = 1 next = 10, 1<10 so subtract from result, current = 10 next 0 so add to result that way we get result = 10-1+10
            result -= currentValue
        } else {
            result += currentValue
        }
        }
        return result 
    }
    
}