package main

/**
 * Created by Roger on 30/10/2016.
 */
class Utils {

    @Throws(NumberFormatException::class)
    fun getLineInInt(line: String?): Double = line!!.toDouble()

}