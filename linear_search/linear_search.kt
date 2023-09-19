/* 
    below we have implemented a simple function 
    for linear search in Kotlin
    
    - values[] => array with all the values
    - target => value to be found
*/


fun main() { 
    val list = listOf(1,2,3,4,5,6,7,8,9)
    val hasil = linearSearch(list, 10)
    println(if(hasil == -1) "Not Found" else "posisi angka anda berada di : ${hasil+1}")
} 
fun linearSearch(values: List<Int>, target : Int) : Int{
    for(i in 0..values.size - 1){
        if(values[i] == target){
            return i
        }
    }
    return -1
}