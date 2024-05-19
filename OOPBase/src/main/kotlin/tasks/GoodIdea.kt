package tasks

fun ideas(list: List<String>) :String {
    var i = 0
    var index = 0
    while (index < list.size) {
        if (list[index] == "good") {
            i++
            if (i > 2) {
                break
            }
        }
        index++
    }
    if (i == 1 || i ==2) {
        return "Publish!"
    }
    else if (i > 2) {
        return "I smell a series!"
    }
    else {
        return "Fail!"
    }
}