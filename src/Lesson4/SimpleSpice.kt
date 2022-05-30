package Lesson4

class SimpleSpice {
     var spiceName: String = "curry"
     var spiceSpiciness: String = "mild"
     var heat: Int? = null
          get() = if (spiceSpiciness == "mild") 5 else 0

     var intRange: IntRange = (0..10)
}