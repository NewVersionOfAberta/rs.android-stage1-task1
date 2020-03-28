package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0;
        for (i in bill.indices){
            if (i == k){
                continue
            }else
                sum += bill[i]
        }
        sum /= 2
        return if (sum == b) "Bon Appetit" else (b - sum).toString()
    }
}
