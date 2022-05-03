class CompactFunctions {
    fun main(args: Array<String>) {
        println(whatShouldIDoToday("happy"))
    }

    fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
        return when {
            goForAWalk(mood, weather)-> "go for a walk"
            stayInBed(mood, weather, temperature) -> "stay in bed"
            goSwimming(temperature) -> "go swimming"
            else -> "Stay home and read."
        }
    }
    fun stayInBed(mood: String, weather: String, temperature: Int) : Boolean = mood == "sad" && weather == "rainy" && temperature == 0
    fun goForAWalk(mood: String, weather: String) : Boolean = mood == "happy" && weather == "Sunny"
    fun goSwimming(temperature: Int) : Boolean = temperature > 35
}