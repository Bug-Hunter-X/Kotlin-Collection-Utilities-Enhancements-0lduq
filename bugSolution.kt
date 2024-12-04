fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }.toMutableList() //Use filter and toMutableList for better control
    println(newList) // Output: [1, 2]

    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList2 = list2.filterNot { it > 2 }.toMutableList() //Use filterNot and toMutableList for better control
    println(newList2) // Output: [1, 2]
    
    //For very large lists, consider using iterators for better performance
    val largeList = mutableListOf<Int>()
    for(i in 1..1000000) largeList.add(i)

    val filteredLargeList = mutableListOf<Int>()
    for(element in largeList){
        if(element <= 500000) filteredLargeList.add(element)
    }
    println(filteredLargeList.size) 
} 