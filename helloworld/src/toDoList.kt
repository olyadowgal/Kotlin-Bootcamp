fun main (args: Array<String>) {
    var mood = readLine()?.toIntOrNull() ?: "happy"
}
fun whatShouldIDoToday(mood: String,
                       weather: String = "Sunny",
                       temperature: Int = 24) : String {
    return when {
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "stay in bed"
    }
}