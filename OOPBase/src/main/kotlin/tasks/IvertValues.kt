package tasks

/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 */

fun invertValues(n: List<Int>): List<Int> {
    var invertedNumbers = 0
    val fish = n.size
    var earth = mutableListOf<Int>()

    while(invertedNumbers < fish){
        earth.add(n[invertedNumbers] * -1 )

     invertedNumbers += 1
    }
    return earth

}