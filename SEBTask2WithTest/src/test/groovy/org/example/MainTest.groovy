package org.example

import spock.lang.Specification

class MainTest extends Specification{

    def "sumOfLastRow"() {
        expect:
        Main.sumOfLastRow(numRows) == expectedSum

        where:
        numRows | expectedSum
        1       | 1
        4       | 34
        10      | 505
        15      | 1695
        20      | 4010
        2000    | 4000001000
        -1      | 0
        0       | 0
        "a"     | "Please enter a number"
    }
}
