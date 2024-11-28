package za.co.howtogeek.day3

fun main(){
    println("Please enter 2 numbers you'd like to add, pressing <Enter> after each.")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println("The addition of $num1 and $num2 = ${add(num1, num2)}")

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

fun makeCoffee(name: String, sugarCount: Int){
    when(sugarCount){
        0 -> println("Coffee with no sugar for $name.")
        1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}