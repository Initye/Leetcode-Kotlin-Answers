class Solution {
    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        var numbers = mutableListOf<Int>() //Tracking elements in array
        var countArray = IntArray(A.size) //Storing result (count)
        var count = 0 //Counting elements in numbers

        for(i in 0 until A.size){ 
            if(A[i] in numbers) { //If we can find this element in $numbers then count++ 
                count++
            } else {
                numbers.add(A[i]) //If we cannot find this element in $numbers then add it to $numbers
            }
            
        
            if(B[i] in numbers) { //If we can find this element in $numbers then count++ 
                count++
            } else {
                numbers.add(B[i]) //If we cannot find this element in $numbers then add it to $numbers
            }

            countArray[i] = count //Updating the array with current result
        }

        return(countArray)
    }
}
