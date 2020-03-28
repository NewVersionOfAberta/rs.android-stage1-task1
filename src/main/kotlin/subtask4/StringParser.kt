package subtask4

import java.util.*
import javax.swing.text.ChangedCharSetException

class StringParser {

    // TODO: Complete the following function

    fun getResult(inputString: String): Array<String> {
        val strings = MutableList<String>(0) {""}
        val tempArray = IntArray(inputString.length){0}
        val opensList = listOf('<', '(', '[')
        val closeList = listOf('>', ')', ']')
        val bracketValue = arrayOf(1, 2, 3)
        for (i in inputString.indices){
            if (inputString[i] in opensList){
                tempArray[i] = bracketValue[opensList.indexOf(inputString[i])]
                bracketValue[opensList.indexOf(inputString[i])] += 3;
            }else
                if (inputString[i] in closeList) {
                    bracketValue[closeList.indexOf(inputString[i])] -= 3
                    tempArray[i] = bracketValue[closeList.indexOf(inputString[i])]
                }
        }
        var temp: Int
        for (i in tempArray.indices){
            if (tempArray[i] != 0){
                temp = tempArray[i]
                tempArray[i] = 0
                strings.add(inputString.substring(i + 1, tempArray.indexOf(temp)))
                temp = tempArray.indexOf(temp)
                tempArray[temp] = 0
            }
        }

        return strings.toTypedArray()
    }
}
