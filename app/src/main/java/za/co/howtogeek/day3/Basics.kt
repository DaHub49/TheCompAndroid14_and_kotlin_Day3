package za.co.howtogeek.day3

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val amountOfCream: Int
)

fun main(){
    /*
    // Creating myBook object:
    var myBook = Book()
    var customBook = Book("Highway to Hades", "Dylan Martin", 2014)

    println("Book itle: ${myBook.title}, book author: ${myBook.author}, year published: ${myBook.yearPublished}")
    println("Book itle: ${customBook.title}, book author: ${customBook.author}, year published: ${customBook.yearPublished}")
    //println("{myBook.cuatomToString()}: ${myBook.customToString()}")
    //println("{customBook.customToString()}: $customBook.customToString()")
     */

    /*
    // Creating a Dog object:
    var bella = Dog("Bella", "Miniature Schnauzer", 9)
    println("${bella.name} is a ${bella.breed} and is ${bella.age} years old.\n")
    println("A year has passed.")
    bella.age++
    println("\n${bella.name} is now ${bella.age} years old.")
     */

    /*
    println("Please enter 2 numbers you'd like to add, and then devide, pressing <Enter> after each.")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println("The addition of $num1 and $num2 = ${add(num1, num2)}")
    println("The division of $num1 by $num2 = ${divide(num1.toDouble(), num2.toDouble())}")
     */

    // custom CoffeeDetails object:
    //val coffeeForDyls = CoffeeDetails(sugarCount = 0, name = "Dylan", "standard", 0)

    var name = orderCoffee()
    if (!name.equals("")) {
        val customCoffee =
            CoffeeDetails(sugarCount(), name = name, size = coffeeSize(), amountOfCream())
        makeCoffee(customCoffee)
    }
    else
        println("Thank you, $name. Come again!")
}

fun add(num1: Int, num2: Int): Int {
    var result = num1 + num2
    return result
}

fun divide(num1: Double, num2: Double): Double {
    var result: Double = num1/num2
    return result
}

fun orderCoffee(): String{
    println("Who is this coffee for?")
    val name: String = readln()
    return name
}

fun coffeeSize(): String {
    var coffeeSize = "250"
    println("What size coffee would you like?")
    coffeeSize = readln()
    return coffeeSize
}

fun sugarCount(): Int {
    var sugarCountVar: Int = 0
    println("How many sugars do you want with your coffee?")
    sugarCountVar = readln().toInt()
    return sugarCountVar
} // sugarCount

fun amountOfCream(): Int {
    var creamCountVar: Int = 0
    println("How much cream do you want with your coffee in ml?")
    creamCountVar = readln().toInt()
    return creamCountVar
}

// can use data class asparameters for functions:
fun makeCoffee(coffeeDetails: CoffeeDetails){
    when(coffeeDetails.sugarCount){
        0 -> println("${coffeeDetails.size} coffee with no sugar for ${coffeeDetails.name} and ${coffeeDetails.amountOfCream}ml of cream.")
        1 -> println("${coffeeDetails.size} coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and ${coffeeDetails.amountOfCream}ml of cream.")
        else -> println("${coffeeDetails.size} coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and ${coffeeDetails.amountOfCream}ml of cream.")
    }
}