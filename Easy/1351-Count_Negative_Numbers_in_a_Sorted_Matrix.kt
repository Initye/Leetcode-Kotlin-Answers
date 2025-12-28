class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        //Start from top right corner of the matrix
        var row = 0
        var column = grid[0].size - 1  
        var counted = 0 
        val rows = grid.size //Number of rows in the grid

        while (row < rows && column >= 0) { //Traverse while we are in the matrix boundaries
            if(grid[row][column] < 0) { if the current element is negative
                counted += rows - 1 //all elements in the same columns are also negative (columns are sorted)
                column-- //Move left 
            } else {
                row++ //Not negative move to the next row (down)
            }
        }
        return counted 
    }
}

//Brute Force
class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var counted = 0
        
        val flat = grid.flatMap { it.asList() }

        for (i in 0 until flat.size) {
            if (flat[i] < 0) {
                counted += 1 
            }
        }
        return counted
    }
}