package za.co.howtogeek.day3

fun main(){
    // Creating myBook object:
    var myBook = Book()
    var customBook = Book("Highway to Hades", "Dylan Martin", 2014)

    println("Book itle: ${myBook.title}, book author: ${myBook.author}, year published: ${myBook.yearPublished}")
    println("Book itle: ${customBook.title}, book author: ${customBook.author}, year published: ${customBook.yearPublished}")
    //println("{myBook.cuatomToString()}: ${myBook.customToString()}")
    //println("{customBook.customToString()}: $customBook.customToString()")


    // Creating a Dog object:
    var bella = Dog("Bella", "Miniature Schnauzer")
    println("${bella.name} is a ${bella.breed}")

    println("Please enter 2 numbers you'd like to add, and then devide, pressing <Enter> after each.")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println("The addition of $num1 and $num2 = ${add(num1, num2)}")

    println("The division of $num1 by $num2 = ${divide(num1.toDouble(), num2.toDouble())}")

    do {
        println("Who is this coffee for?")
        var name: String = readln()
        if (!name.equals("")) {
            println("How many sugars do you want with your coffee?")
            var sugarCount = readln().toInt()
            makeCoffee(name, sugarCount)
        }
    }while (!name.equals(""))
}

fun add(num1: Int, num2: Int): Int {
    var result = num1 + num2
    return result
}

fun divide(num1: Double, num2: Double): Double {
    var result: Double = num1/num2
    return result
}

fun makeCoffee(name: String, sugarCount: Int){
    when(sugarCount){
        0 -> println("Coffee with no sugar for $name.")
        1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}