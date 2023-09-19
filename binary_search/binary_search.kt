/* 
    below we have implemented a simple function 
    for binary search in Kotlin
    
    - values[] => array with all the values
    - target => value to be found
*/


fun main() { 
    val list = (1..2097152).toList()
    val hasil = binarySearch(list, 1)
    println(if(hasil == -1) "Not Found" else "posisi angka anda berada di : ${hasil+1}")
} 
fun binarySearch(values: List<Int>, target : Int) : Int{
    var max : Int = values.size - 1
    var min : Int = 0 

    var guess : Int
    var step : Int = 0

    while(max >= min){
        guess = (max+min)/2
        step = step + 1

        if(values[guess] == target){
            println("Number of Step = $step")
            return guess
        } else if( values[guess] > target ){
            //on left half
            max = guess - 1
        } else {
            //on right half
            min = guess + 1
        }

    }
    return -1
}