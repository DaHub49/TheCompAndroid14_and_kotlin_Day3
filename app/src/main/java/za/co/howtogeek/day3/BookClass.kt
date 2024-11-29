package za.co.howtogeek.day3

class Book(val title: String = "Unknown", val author: String = "Anonymous", val yearPublished: Int = 2024) {

    /**
     * init {
     *         bark(name, breed)
     *     }
     *
     *     fun bark(name: String, breed: String) {
     *         println("${name} the ${breed} says Woof Woof")
     *     }
     */


    init {
        customToString(title, author, yearPublished)
    }

    fun customToString(title: String, author: String, yearPublished: Int): String{
        val toStringVal = "Title: $title, Author: $author, year published: $yearPublished"
        return toStringVal

    }

}