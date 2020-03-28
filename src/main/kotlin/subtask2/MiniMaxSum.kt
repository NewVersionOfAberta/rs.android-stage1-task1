package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        input.sort();
        val min: Int = 0
        val max: Int = 1
        val intArray = IntArray(2) {0}
        for (i in 0 until input.size - 1){
            intArray[min] += input[i]
            intArray[max] += input[input.size - 1 - i]
        }
        return intArray;
    }
}
