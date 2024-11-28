package za.co.howtogeek.day3

fun main(){
    makeCoffee(1)
    makeCoffee(2)
    makeCoffee(3)
}

fun makeCoffee(sugarCount: Int){
    if (sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar.")
    } else
        println("Coffee with $sugarCount spoons of sugar.")
}