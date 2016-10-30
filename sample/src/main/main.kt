package main

/**
 * Created by Roger on 30/10/2016.
 */
fun main(args: Array<String>) {

    var catA: Double = 0.00
    var catB: Double = 0.00

    try {
        println("Introduzca valor del Cateto 1: ")
        catA = Utils().getLineInInt(readLine())
        println("Introduzca valor del Cateto 2: ")
        catB = Utils().getLineInInt(readLine())
    } catch(e: NumberFormatException) {
        println("Introduzca un valor o valores correctos")
    }
    val hip: Double = Math.sqrt(Math.pow(catA, 2.0) + Math.pow(catB, 2.0))
    println("Hipotenusa es: $hip")

}