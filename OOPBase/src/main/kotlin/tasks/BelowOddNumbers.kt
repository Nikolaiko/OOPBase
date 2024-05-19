package tasks

fun belowAddNumbers(n: Int): Int
{
    var x = 0
    var g = n - 1
    while (g != 0)
    {
        if (g % 2 != 0)
        {
            x +=1
        }
        g -=1
    }
    return x
}