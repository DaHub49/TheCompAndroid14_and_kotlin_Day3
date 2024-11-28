package za.co.howtogeek.day3

fun main(){
    makeCoffee(1, "Amy")
    makeCoffee(2, "Jaco")
    makeCoffee(3, "Fred")
    makeCoffee(0, "Marco")
}

fun makeCoffee(sugarCount: Int, name: String){
    when(sugarCount){
        0 -> println("Coffee with no spoons of sugar for $name.")
        1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}