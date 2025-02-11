//Best solution 

class Solution {
    fun removeOccurrences(s: String, part: String): String {
        if (s.isEmpty()) return "" //Return empty string if the input is empty

        var result = StringBuilder(s) //Initialize StringBuilder with the input string
        var index = result.indexOf(part) //Keep looping until the part is no longer found
        
        while (index != -1) {
            result.delete(index, index + part.length)//Remove the part from the string
            index = result.indexOf(part)//Search for the next occurrence of the part
        }

        return result.toString()  
    }
}

//Meh solution but works
class Solution {
    fun removeOccurrences(s: String, part: String): String {
        if (s.isEmpty()) return "" //Return empty string if the input is empty

        var result = StringBuilder() //Initialize an empty StringBuilder to build the result

        for(i in s.indices) {
           result.append(s[i].toString()) //Append the current character to the result
           if (result.length >= part.length && result.takeLast(part.length) == part) {   //Check if the last part.length characters in result match the part string
                result.delete(result.length - part.length, result.length) //If they match, remove the last part.length characters
           }
        }
        
        return result.toString()  
    }
}

//Meh solution but works
class Solution {
    fun removeOccurrences(s: String, part: String): String {
        if (s.isEmpty()) return "" //Return empty string if the input is empty

        var result = s //Initialize the result as the input string

        while(result.contains(part)) { //Keep looping as long as 'part' is found in result
            result = result.replaceFirst(part, "") //Remove the first occurrence of part (Using replaceFirst is a must here, dont use replace)
        }

        return result  
    }
}