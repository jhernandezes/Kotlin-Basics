package Lesson4

import java.sql.DriverManager.println


    fun main(args : Array<String>) {
                getSimpleSpice()
            }

    fun getSimpleSpice() {
        var simpleSpice : SimpleSpice = SimpleSpice()
        simpleSpice.spiceName = "curry"
        simpleSpice.spiceSpiciness = "mild"
        println("Spice name: ${simpleSpice.spiceName} " + " and spice spiciness: ${simpleSpice.spiceSpiciness}")
    }

