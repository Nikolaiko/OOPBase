package person

import java.awt.Point
import java.awt.geom.Point2D

open class BasePerson(inputHealth: Int) {
    var health: Int = inputHealth
    private var location: Point = Point()

    fun move(destination: Point) {
        location= destination
    }

    fun destroy() {
        println("Destroying Base Person")
    }

}