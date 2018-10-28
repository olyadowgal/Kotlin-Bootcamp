import java.util.*

fun main(args: Array<String>) {
    var myfortune = getFortuneCookie(getBirthday())
    print("My fortune is: $myfortune")
}

fun getFortuneCookie(b : Int) : String {
    val fortune = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    val index = when (b) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> b.rem(fortune.size)
    }
    return fortune[index]
}

fun getBirthday() : Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}