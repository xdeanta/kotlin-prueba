fun main(){
    println("Hello World!")
    otrafuncion()
    println(sum(5,8))
    printSum(4,4)
}

fun otrafuncion(){
    println("adios")
}

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}