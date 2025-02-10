//SOLUTION USING STACK

class Solution {
    fun clearDigits(s: String): String {
        var stack = Stack<Char>() 

        for(i in s.indices) { //Iterate through whole String
            if(s[i].isLetter()) { //If our current element is letter
                stack.push(s[i]) //We add(push) it to the stack
            } else { //If it's number
                stack.pop() //Delete(pop) last element(on top) from stack
            }
        }
        return stack.joinToString("") 
    }
}


//SOLUTION USING STRING BUILDER

class Solution {
    fun clearDigits(s: String): String {
        var result = StringBuilder()

        for(i in s.indices) { //Iterate through whole String
            if(s[i].isLetter()) { //If our current element is letter
                result.append(s[i].toString()) //We append it to the result
            } else { //If it's number
                result.deleteCharAt(stack.length - 1 ) //Delete last character of result
            }
        }
        return result.toString()
    }
}