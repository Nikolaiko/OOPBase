fun findMax(inputList: List<Int>): Int {
    var max = Int.MIN_VALUE
    for (i in inputList.indices) {
        if (max < inputList[i]) {
            max = inputList[i]
        }
    }
    return max
}

fun printList(inputList: List<Any>) {
    for (i in inputList.indices) {
        println(inputList[i])
    }
}

fun listtask2(){
    var numbers= mutableListOf<Int>(5,6,7)
    for (i in 0..4) {
        println(i)
    }

    for (i in numbers.indices) {
        println(numbers[i])
        numbers[i]=numbers[i]+1
    }
}

fun listtask(){
    var city= listOf<String>("Omsk","Moscow","London")
    println(city[2])
    var names= mutableListOf<String>("Aleksandra","Nikolay")
    names.add("Aleksandra")
    names.removeAt(1)
    names.remove("")
    var food= listOf<Int>(1,2,3)

}

// Задачи по теме if-else
fun ifFirstTask() {
    var x = 6
    var y = 8

    if (y != 0) {
        println(x / y)
    } else {
        println("Делить на ноль нельзя")
    }

    println("Программа закончена")
}

fun ifSecondTask() {
    var p = 4
    var b = 2
    var fg = p + b
    if (fg > 0){
        println("Больше ноля")
    } else {
        println("Меньше ноля")
    }
}

fun ifThirdTask() {
    val month = 12
    if (month == 12) {
        println("December")
    }
    else if (month == 11) {
        println("November")
    }
    else if (month == 10) {
        println("October")
    }
    else if (month == 9) {
        println("September")
    }
    else if (month == 8) {
        println("August")
    }
    else if (month == 7) {
        println("July")
    }
    else if (month == 6) {
        println("June")
    }
    else if (month == 5) {
        println("May")
    }
    else if (month == 4) {
        println("April")
    }
    else if (month == 3) {
        println("March")
    }
    else if (month == 2) {
        println("February")
    }
    else if (month == 1) {
        println("January")
    } else {

    }
}