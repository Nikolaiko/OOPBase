import person.BasePerson
import person.Enemy
import person.Nikolai
import java.awt.Point

fun main(args: Array<String>) {
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
