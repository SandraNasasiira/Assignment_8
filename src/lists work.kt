fun main() {
println(is_even(5))
    println(is_even(8))

    var items= product("mangoes",77,150,"fruit")
    items.Category
    items.Price

    goods()

    println(evenIndices("banana"))
    println(evenIndices("sandra"))
    println(evenIndices("mandek"))
    println(girls(arrayOf("sandra","Resty","Esther","Janet")))


}
fun is_even(number:Int):Boolean{
    if (number % 2 == 0)
            return true

           return false
    }
data class product( var Name:String,var weight:Int,var Price:Int, var Category:String)

fun goods(){
    var category="vegetables"
    when(category){
        "fruits"-> println("mangoes,oranges,pawpaw,apples")
        "vegetables"-> print("cabbage,spinach,onions,tomatoes")
        "drinks"->println("soda,wine,bear,tusker")
        else-> println("not available")
    }
}
fun evenIndices(name:String):String{
    var items=""
    for (x in name){
        if (name.indexOf(x)%2==0){
            items+=x
        }
    }
    return items
}

fun girls(name:Array<String>):List<String>{
    var listOfNames= mutableListOf<String>()
    for (names in name){
        if (names.length%2==0){
            listOfNames.add(names)
        }
    }
    return (listOfNames)
}


