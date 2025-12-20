class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        var counted = 0 //Count of columns that are not sorted
        val xLength = strs[0].length //Number of columns

        for (i in 0 until xLength) { // i = column index
            var yLength = 0
                while (yLength < strs.size - 1) { //loop over rows in this column
                    if (strs[yLength][i] > strs[yLength + 1][i]) { // [yLength+1][i] check same character index but in the next string
                        counted += 1 //Increment count of unsorted columns
                        break //If the column is not lexicographically correct, add one to counted and break (continue with next column)
                    }
                    yLength += 1 //Move to the row in the current column
                }
            }
        return counted //Return total number of unsorted columns 
    }
}



//Slower version 
class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        var counted = 0
        val xLength = strs[0].length
        for (i in 0 until xLength) { //columns (index of a character)
        var yLength = 0
            while (yLength < strs.size - 1) { //rows
                if (strs[yLength][i] > strs[yLength + 1][i]) { // [j+1][i] check same character index but in the next string
                    counted += 1
                    yLength += 1
                    break //If the column is not lexicographically correct, add one to counted and break (continue with next column)
                }
                yLength += 1
            }
        }
        return counted
    }
}