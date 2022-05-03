class FilterLazy {

//    You can do the following filter exercise in REPL.
//
//    Create a list of spices, as follows:
//    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
//    Create a filter that gets all the curries and sorts them by string length.
//    Hint: After you type the dot (.), IntelliJ will give you a list of functions you can apply.
//    Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
//    Take the first three elements of the list and return the ones that start with 'c'.

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    fun orderList(list : List<String> = spices) : List<String> {
        return list.sortedWith(compareBy {it.length})
    }

    fun filterList(list: List<String>) : List<String>{
        return orderList().asSequence().filter { (it[0] == 'c') && (it[it.length] =='e') }.toList().take(3)
    }


}