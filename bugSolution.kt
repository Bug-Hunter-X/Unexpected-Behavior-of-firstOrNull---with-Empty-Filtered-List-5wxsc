fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //This will print 2
    val firstEven = evenNumbers.firstOrNull() ?: -1 // provides a default value in case of empty list 
    println(firstEven) //This will print 2
    val emptyList = listOf<Int>()
    val firstEvenEmpty = emptyList.filter { it % 2 == 0 }.firstOrNull() ?: -1
    println(firstEvenEmpty) //This will print -1
}