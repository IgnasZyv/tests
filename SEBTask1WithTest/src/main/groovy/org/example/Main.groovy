package org.example

static void main(String[] args) {
    def ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]

    print(parts_sums(ls))
}

static def parts_sums(ArrayList<Integer> ls) {

    def result = []

    // Calculate the initial sum of all elements in ls
    def totalSum = ls.sum()

    // Add the totalSum to the result list as the first element
    result.add(totalSum)

    for (int i = 0; i < ls.size(); i++) {
        if (ls[i] !instanceof Integer || ls[i] < 0) {
            return "iteration failed, please enter a positive number"
        }
        // Subtract the current element from the totalSum and add it to the result list
        totalSum -= ls[i]
        result.add(totalSum)
    }

    return result
}