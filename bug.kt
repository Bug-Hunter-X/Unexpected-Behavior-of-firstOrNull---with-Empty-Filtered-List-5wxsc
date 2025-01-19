fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //This will print 2
    val firstEven = evenNumbers.firstOrNull()
    println(firstEven) //This will print 2, and not throw an exception, even if evenNumbers were empty
}