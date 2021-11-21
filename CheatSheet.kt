fun main(args: Array<String>) {
    println("HelloWorld!")
    print("this is ")
    print("awesome\n")

    var changeable:Int = 3 //value of var can be changed
    val unchangeable:Int = 4 // value of val cant be changed

    //type casts need to be uppercase
    var number:Int
    number = 2 //variables dont need a type cast if they are getting assigned directly
    /*wont work
    var unassigned
    unassigned = 2*/

    var typeConver:Long = number.toLong()

    var stringone:String = "Hello"
    var stringtwo:String = "Hello"
    var stringthree:String = "hello"
    
    println(stringone.compareTo(stringtwo)) //retunr 0 means they are equal
    println(stringone.compareTo(stringthree))
    println(stringone.toLowerCase().compareTo(stringthree))

    var locate = "Please locate where 'locate' occurs"
    println(locate.indexOf("locate"))//returns intex of first char of the searched pattern

    println("when")
    val day = 4
    val result = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Weekend"
    }
    println(result)

    println("break")
    var i = 0
    while(i<10){
        println(i)
        i++
        if(i == 4){
            break
        }
    }
    
    println("continue")
    i = 0
    while(i<10){
        if(i == 4){
            i++
            continue
        }
        println(i)
        i++
    }

    println("array")
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    if("Volvo" in cars){
        println("it exists")
    }
    else{
        println("It doesnt")
    }
    for(x in cars){
        println(x)
    }

    println("ranges")
    for(num in 1..5){
        println(num)
    }
    //also working with break/continue

    println("function")
    myFunction()

    println("classes and subclasses")
    val myObj = myChildClass()
    myObj.childFunction()

}

fun myFunction(){
    println("i got executed")
}

open class myParentClass(){ //superclass
    val value = 5;
}

class myChildClass:myParentClass(){ //subclass
    fun childFunction(){
        println(value)
    }
}