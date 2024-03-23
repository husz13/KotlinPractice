package com.hus.kotlinpractice
//primary constructor
 open class Person(var age:Int) {
     var name :String? = null
    var gender :Boolean? = null
    //Secondary Constructor
    //Primary constructor called :this(age) ---> Implicit Call
     constructor(age: Int,name:String?):this(age){
         this.name = name
     }
    //secondary constructor calls another secondary constructor that calls the primary -->Explicit Call
    constructor(age: Int,name: String?,gender:Boolean?):this(age,name){
        this.gender = gender
    }
    init {

    }
}
class Student : Person{
    var h :String = "Name: $name"

    //child class constructor must initialize base constructor
    constructor( x:Int):super(x){

    }
    constructor( x:Int,y:String?):super(x,y){

    }
    fun printName(){
        println(h)
    }

}
class MyClass(val name: String) {
    //allowed because it's initialized in the init
    val greeting: String

    init {
        println("Initializing MyClass")
        greeting = "Hello, $name!"
    }

    init {
        println("Second init block")
        println("Initialized greeting: $greeting")
    }
}

//Abstract classes can have both abstract and concrete methods,
abstract class Car{
    //Abstract classes can contain state (properties)

    abstract var x :Int
    //Abstract classes can have both abstract and concrete methods,
    fun start():Unit{
        println("Start Engine ")
    }
  abstract  fun stop() : Unit
}
interface Animal{
    //while interfaces can only have abstract methods.
    fun eat(){
        println("asdas")
    }

    //while interfaces cannot.
    //  Error
    //var x
}
interface Human {
    fun HHH()
}
//A class can inherit from only one abstract class, but it can implement multiple interfaces.

class BMW : Car() {
    override var x : Int = 5
    override fun stop() {
        println("Stop")
    }
}
class Dog :Animal,Human{
    override fun HHH() {
println("HHH")    }


}
fun main() {
//    val persons = listOf(Person("Ahmed",100),Person("Mohamed", age = 122))

    val car = BMW()
    val dog = Dog()
    car.start()
    dog.eat()

}

