package subtask1

class HappyArray {

    // TODO: Complete the following function

    fun convertToHappy(sadArray: IntArray): IntArray {
        val newList = sadArray.filterIndexed { index, a ->
            if (index > 0 && index < sadArray.size - 1)
                a < sadArray[index - 1] + sadArray[index + 1]
            else
                true

        }
        return if (newList.toIntArray().contentEquals(sadArray)) sadArray else convertToHappy(newList.toIntArray())
    }
}
