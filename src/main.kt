import kotlin.math.max

fun main() {
    var fruits = mutableListOf<String>()
   fruits.add("Banana")
    fruits.add("Apple")
   fruits.add("Avacado")
   fruits.add("Mango")
    println(fruits)
    fruits.remove("Apple")
    fruits.removeAt(2)
   println(fruits)
   var longName =fruits.filter { fruits->fruits.length>5 }
   println(longName)
  var x =person("jane",12)
   var  y=person("mercy",34)
    var p =person ("sam",23)
    var person= listOf(x,y,p)
    println(person)


    var classes = listOf("AnitaB", "lovelace", "lisalab")
   classes.forEach { x ->
       println(x)
    }
    println(classes)

    var colors = mutableListOf("red", "blue", "green")
    colors.add("yellow")
    colors.remove("red")
   println(colors)
   var num = listOf(19, 18, 22, 18, 23, 45, 34, 34, 23, 12, 12)
   println(num.count())
   println(num.minOrNull())
    println(num.lastOrNull())
   println(num.average())
   num.forEach { y ->
       println(y)
        var numSorted = num.sorted()
       println(numSorted)
    }
    var toyota = car("toyota", "corolla")
   var ford = car("ford", "fiest")
    var audie = car("audie", "A6")
    var mycars = listOf("toyota", "ford", "audie")
print(mycars)
  // var sortedcars = mycars.sortedByDescending
}
data class car(var make:String, var model:String,)
//immutable can't be changed/add or remove(listof)
//mutable can be added and removed
//hint use forEach
//How to sort lists

data class  person(var name:String, var age:Int)

