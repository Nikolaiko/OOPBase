import camera.CameraSelector
import person.Enemy
import person.Nikolai
import tasks.*
import java.awt.Point

fun main(args: Array<String>) {
    val x = belowAddNumbers(5)
    //println(x)

    val y = ideas(listOf("good", "bad", "good"))
    //println(y)

    val scoreExample = footballScore(listOf("3:1", "1:1", "1:1", "1:1", "1:1", "1:1", "1:1", "1:1", "1:1", "1:1", "1:1"))
    println(scoreExample)

    val squareExample = squareFunction(listOf(2, 4))
    println(squareExample)
}

fun minimalDistance (intList:List<Int>) {
    var element = 0

}

fun oopExample () {
    var hero = Nikolai("Nikolai")
    hero.move(Point(1, 1))
    val enemy1 = Enemy(10)
    val enemy2 = Enemy(20)
    enemy1.move(Point(100,50))
    enemy2.move(Point(20,60))

    println(hero.health)
    enemy1.doDamage(hero)
    println(hero.health)
    enemy1.doDamage(enemy2)
}
