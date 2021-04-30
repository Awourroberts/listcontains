fun main() {
    println(studentNames(listOf("Jadel", "Lynch", "Jewel", "Luiz", "Barack", "Brain", "Sam", "Felix", "Robert", "Steve")))
    println(averageHeight(listOf(2.4,5.8,4.6,2.3,3.4) as MutableList<Double>))
    attributes()
    Person()
   var cars = listOf(
       Car("KAS231P",200),
       Car("KBD543Z",300)
   )
    println(car(listOf(200,300)))




}
    fun studentNames(name: List<String>): List<String> {
        val names = mutableListOf<String>()
        for (y in name)
            if (name.indexOf(y) % 2==0) {
                names.add(y)
        }

    return names
}
fun averageHeight(height:MutableList<Double>):Double {
    var average=height.average()
    var total=height.sum()
    println(total)
    return average

}

data class Person(var name:String, var age:Int, var height:Double, var weight:Double)

fun attributes(){
        var Person = listOf(
            Person("Rose",40,5.8,60.5),
            Person("Beth",20,4.5,60.5),
            Person("Caro",22,3.5,40.5),
            Person("Brian",24,5.5,50.5)
        )
    var sortedAge=Person.sortedByDescending { Person->Person.age }
    println(sortedAge)

    }
data class Citizen(var name:String,var age:Int,var height:Double,var weight:Double)
fun Person(){
    var Citizen= mutableListOf(

    Person("Rose",40,5.8,60.5),
    Person("Beth",20,4.5,60.5),
    Person("Caro",22,3.5,40.5),
    Person("Brian",24,5.5,50.5),
    )
    Citizen.addAll(listOf(

    Person("Kevin",25,6.3,54.2),
    Person("Daisi",21,5.4,55.4),

        ))
    println(Citizen)

}
data class Car(var registration:String,var mileage:Int)
fun car(mileage:List<Int>):Int{
    var z=mileage.average().toInt()
    return z
}























