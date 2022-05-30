package Lesson4

private var currentPage: Int? = null

open class Book {
    var tittle : String? = null
    var author : String? = null
    open var readPage = currentPage?.plus(1)
}

class eBook() : Book() {
    var format : String = "text"
    override var readPage: Int? = currentPage?.plus(250)
}