package person

open class Enemy(enemyDamage: Int): BasePerson(10) {
    private val damage: Int = enemyDamage

    open fun doDamage(target: BasePerson) {
        target.health = target.health - damage
    }
}