class Solution {
    fun coloredCells(n: Int): Long {
        
        var grid: Long = 1

        if (n == 1) return grid //If time is 1 then we have only 1 cell

        for (i in 2..n) { //For i in seconds
            grid += 4 * (i - 1) //Every second is + 4 cells and with every second we add new layer to the grid
        }
        return grid
    }
}