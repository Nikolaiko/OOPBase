package tasks

fun oddOrEven(x: Int): String {
    if (x % 2 == 0) {
        return  "Even"
    } else {
        return "Odd"
    }
}

fun oddOrEven1(x: Int) = if (x % 2 == 0) {
    "Even"
} else {
    "Odd"
}

fun oddOrEven2(x: Int) = when (x % 2 == 0) {
    true -> "Even"
    false -> "Odd"
}