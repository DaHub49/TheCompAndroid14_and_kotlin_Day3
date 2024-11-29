package za.co.howtogeek.day3

class Dog constructor (val name: String, val breed: String, var age: Int = 0) {
    // We can use the keyword constructor after the class name e.g: "class Dog constructor()".
    // Still add the parameters after the keyword, if the class requires parameters.
    // But then you don't need to define class properties, as long as the variables are declared with the var or val keyword?
    // Include the keyword "val" before variable names to make the variables global
    // The afore mentioned changes the parameters to properties.

    /**
     * The Constructor is run before the initializer, but is optional.
     * The initializer is always run.
     */

    init {
        bark(name, breed)
    }

    fun bark(name: String, breed: String) {
        println("${name} the ${breed} says Woof Woof")
    }
}