
fun main(args : Array<String>) {
    if (args[0].toInt() < 12) "Good Morning, Kotlin" else "Good night, Kotlin"

}


fun getFortune(){
    val list : List<String> = listOf("A", "B", "C", "D", "E")
    when( getBirthday() ){
        in 1..7 -> list[1]
        in 28..31 -> list[2]
        else -> list[3]
    }
}

fun getBirthday(): Int {
    println("Enter your Birthday date")
    return readln().toIntOrNull() ?: 1
}