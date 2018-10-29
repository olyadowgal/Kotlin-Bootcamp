import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun feedTheFish() {
    var day = randomDay()
    var food = fishFood(day)
    println("Today is $day and fish eats $food")
    if (shouldChangeWater(day)) {
        println("Should change water today!")
    }
}

fun canAddFish (tankSize: Number,
                 currentFish: List<Int>,
                 fishSize: Int = 2,
                 hasDecorations: Boolean = true): Boolean {
    var fishL = 0
    for (i in currentFish.indices)  fishL = fishL + currentFish[i]
    if (hasDecorations) return tankSize.toInt() - fishL - 2 - fishSize >=0
    else return tankSize.toInt() - fishL - fishSize >= 0

}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20) : Boolean {
    return true

}

fun randomDay() : String {
    val week = listOf("Monday", "Thuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]

}

fun fishFood(day: String) : String {
     return when (day) {
         "Monday" -> "flakes"
         "Thuesday" -> "pellets"
         "Wednesday" -> "granules"
         "Thursday" -> "flakes"
         "Friday" -> "mosquitoes"
         "Saturday" -> "plankton"
         "Sunday" -> "flakes"
         else -> "fasting"
    }
}