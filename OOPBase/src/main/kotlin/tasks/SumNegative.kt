package tasks

fun sumNegative(numbers: List<Int>): List<Int> {
    var positiveCount = 0
    var negativeSum = 0
    var i = 0

    while (i < numbers.size) {
        if (numbers[i] > 0) {
            positiveCount += 1
        } else {
            negativeSum += numbers[i]
        }
        i++
    }
    return listOf(positiveCount, negativeSum)
}