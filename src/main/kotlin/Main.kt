fun main() {
var all = indices(mutableListOf("animals","land","oceans","names",
        "wendy","fries","seven","Nessie","lakes","rivers"))
var group = people(mutableListOf(132.0,100.0,150.0,177.0,149.0))

var attributes = personas("James",25,170.0,59.8)
var det =attributes.details()
  var addi=  attributes.additional()
    var alltog= listOf(det,addi)
    println("question4 $addi,$alltog")

//    var transport = car("UG567",365.0)
       var trans = listOf(
             car("KE123",124.0),
               car("BR12",56.0),
               car("KE23",349.0),
               car("we28",45.0),
       )
    var averageM = calculation(trans)
    println(averageM)


}
//question1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices ie index 2,4,6 etc

fun indices(names:List<String>):List<String>{

    var empty = mutableListOf<String>()
    for (n in names){
        if (names.indexOf(n)%2==0)
         empty+=n
    }
    return empty
}

//question2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun people(height:List<Double>):Double{

    println(height.average())
    println(height.sum())
    return (height.average())
    return (height.sum())
}


//QUESTION3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
 data class personas (var name:String, var age:Int, var height:Double, var weight:Double){
 open fun details(){
    var person1 = personas("Michaela",21,169.0,55.0)
    var person2 = personas("Nessie",16,169.0,49.0)
    var person3 = personas("Irakoze",23,156.0,57.0)
    var person4 = personas("Nana",20,180.0,50.0)

    var teams = listOf(person1,person2,person3,person4)


val smallest = teams.sortedByDescending { personas -> personas.age}
println(smallest)
}

//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

    fun additional() {
        var person5=personas("Eunice",22,154.0,58.0)
        var person6= personas("Ineza",20,172.0,53.0)
        var newcomers = listOf(person5,person6)

    println(newcomers)


}



 }

//QUESTION4

//class newPeople(name:String, age:Int,  height:Double,  weight:Double):persona(name,age,height,weight ){
//
//    fun additional() {
//        var person5=newPeople("Eunice",22,154.0,58.0)
//        var person6= newPeople("Ineza",20,172.0,53.0)
//
////   super.details(person5)
////        var newcomers = listOf(person5,person6)
//
//    }


//QUESTION5
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class car (var registration:String,var milleage:Double)

    fun calculation(trans:List<car>):Double{
var total = 0.0
        for (c in trans){
            total+=c.milleage
        }

return total/trans.size
  }




