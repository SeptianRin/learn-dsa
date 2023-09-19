/* 
    below we have implemented a simple function 
    for binary search in Javascript
    
    - values[] => array with all the values
    - target => value to be found
*/

let listOfNumber = [1,2,3,4,5,6,7,8,9]

console.log(outputFormatter(binarySearch(listOfNumber,9)))

function binarySearch(list, target){
    var max = list.length-1
    var min = 0

    var guess = 0
    var step = 0

    while( max >= min){
        guess = parseInt((max+min)/2)
        step++

        if(list[guess] == target){
            console.log("Number of Step = " + step)
            return guess
        }
        else if(list[guess] > target){
            //target on left half
            max = parseInt(guess-1)
        } else {
            //target on right half
            min = parseInt(guess+1)
        }
    }
    return -1
}

function outputFormatter(number){
   return number == -1 ? "Not Found" : number+1
}