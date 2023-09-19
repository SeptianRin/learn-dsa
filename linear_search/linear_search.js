/* 
    below we have implemented a simple function 
    for linear search in Javascript
    
    - values[] => array with all the values
    - target => value to be found
*/

let listOfNumber = [1,2,3,4,5,6,7,8,9]

console.log(outputFormatter(linearSearch(listOfNumber,10)))

function linearSearch(list, target){
    for (let i = 0; i < list.length; i++) {
        if( list[i]== target){
            return i
        }
    }
    return -1
}

function outputFormatter(number){
   return number == -1 ? "Not Found" : number+1
}