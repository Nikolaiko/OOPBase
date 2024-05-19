package tasks

fun geometryTask(userHouse: Int, houseCount: Int): Int {
    val evenNumbers = mutableListOf<Int>()
    var count = 0

    while (count < houseCount) {
        evenNumbers.add(2 + (2 * count))
        count += 1
    }

    count = 0
    val oddNumbers = mutableListOf<Int>()
    while (count < houseCount) {
        oddNumbers.add(1 + (2 * count))
        count += 1
    }
    oddNumbers.reverse()

    var result = 0
    if (userHouse % 2 == 0) {
        val index = evenNumbers.indexOf(userHouse)
        result = oddNumbers[index]
    } else {
        val index = oddNumbers.indexOf(userHouse)
        result = evenNumbers[index]
    }

    return result
}