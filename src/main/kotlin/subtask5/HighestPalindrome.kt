package subtask5

class HighestPalindrome {

    fun getStandartPalindrome(digitString: CharArray): String{
        var arr = Array(digitString.size) {' '}
        var temp: Char
        for (i in 0 until digitString.size / 2){
            if(digitString[i] != digitString[digitString.size - i - 1]) {
                temp = if (digitString[i] > digitString[digitString.size - i - 1]) {
                    digitString[i]
                } else {
                    digitString[digitString.size - i - 1]
                }
                digitString[i] = temp
                digitString[digitString.size - i -1] = temp
            }
        }
        return String(digitString)
    }

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var needChanges: Int = 0;
        for (i in 0 until  n / 2){
            if (digitString[i] != digitString[n - i - 1]){
                needChanges++
            }
        }
        val digitArr: CharArray = digitString.toCharArray()
        if (needChanges > k){
            return (-1).toString()
        }else{
            var i: Int = digitString.length - 1;

            while(k - needChanges > 0){
                digitArr[i] = '9'
                i--
                needChanges++
            }
        }
        return getStandartPalindrome(digitArr)
    }
}
