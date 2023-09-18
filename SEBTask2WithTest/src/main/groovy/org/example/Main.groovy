package org.example


static void main(String[] args) {
// Test cases
    println sumOfLastRow(1) // expected 1
    println sumOfLastRow(4) // expected 34
    println sumOfLastRow(10) // expected 505
    println sumOfLastRow(15) // expected 1695
    println sumOfLastRow(20) // expected 4010
    println sumOfLastRow(2000) // expected 4000001000
    println sumOfLastRow(-1) // expected 0
    println sumOfLastRow(0)  // expected 0
    println sumOfLastRow("a") // expected "Please enter a number"
}

static def sumOfLastRow(numRows) {

    if (numRows instanceof String) {
        return "Please enter a number"
    }

    // keep track of the latest number in the triangle. Long datatype to avoid overflow
    def lastRowStart = 1L
    // sum of the last row
    def lastRowSum = 0L

    // move through every row in the triangle
    for (int row = 1; row <= numRows; row++) {
        // move through the columns in the row
        for(int col = 1; col <= row; col++) {
            // only consider the last row of the triangle
            if (row == numRows) {
                // start adding to the sum of the last row
                lastRowSum += lastRowStart
            }
            // increment by one as we move through the columns
            lastRowStart++
        }
    }

    return lastRowSum
}