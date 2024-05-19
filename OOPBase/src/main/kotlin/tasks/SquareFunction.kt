package tasks

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9
 */

fun squareFunction(numbers: List<Int>): Int {
    var sum = 0
    val N = numbers.size
    var i = 0
    while (i < N) {
        sum = sum + numbers[i] * numbers[i]
        i +=1
    }

    return sum
}