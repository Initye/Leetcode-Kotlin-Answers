class Solution {
    fun isValid(s: String): Boolean {
    //We are using 2 strings that represent opening and closing brackets.
        val openBrackets: String = "({["
        val closedBrackets: String = ")}]"
    //We are creating stack to store opening brackets.
        var stack = mutableListOf<Char>()
     
        for(c in s) {
        //Iterate through given string, if it's openBrackets add to stack
            if(openBrackets.contains(c)) {
                stack.add(c)
            }
            else{
                val index = closedBrackets.indexOf(c) //Find index of closedBrackets
                if(stack.size == 0 || stack.removeLast() != openBrackets[index]) { //Remove last char from stack and compare it with corresponding opening bracket using index of closed brackets.
                    return false //If they don't match return false
                }
            }
        }
        return stack.size == 0
    }
}