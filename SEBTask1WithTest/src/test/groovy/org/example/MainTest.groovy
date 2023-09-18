package org.example

import spock.lang.Specification

class MainTest extends Specification{

    def "parts_sums_test"() {
        expect:
        Main.parts_sums(ls as ArrayList<Integer>) == expectedSum

        where:
        ls | expectedSum
        [1000, 250, 3500, 420, 550] | [5720, 4720, 4470, 970, 550, 0]
        [500, 10000, 150, 30000, 2500] | [43150, 42650, 32650, 32500, 2500, 0]
        [7000, 4000, 900, 600, 3000] | [15500, 8500, 4500, 3600, 3000, 0]
        [999999999] | [999999999, 0]
        [-1, -2, -3, -4, -5] | "iteration failed, please enter a positive number"
        [1, 2, 3, "a"] | "iteration failed, please enter a positive number"
    }
}
