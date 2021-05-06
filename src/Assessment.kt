fun main() {
    val person=Intro("Hellen",19)
    println(Intro)
    var number=Calculations(3,4)
    println(Calculations)
    val diet=Human("Hellen",19,50)
    val foodWeight=(2)
}
class Intro(var name:String,var age:Int){
    fun introduction() {
        println("My name is $name and I am $age years old.")
    }
}
class Machine(var age: Int){
    fun give(){
        if(age<6);{
            println("serve a glass of milk")
        }
        if (age>6<15);{
            println("serve a bottle of fanta")
        }
        else{
            println("serve cocacola")
        }

    }
}

class Names()

class Calculator(){
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(num1:Int,num2:Int):Int{
        return num1*num2
    }

    class Human(var name:String,var age: Int, var weight: Int){
        fun eat( var foodWeight: Int){
            println(“I am eating {foodWeight} kgs of food.”)
        }
    }