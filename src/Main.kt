fun main()
{
    // Пример массива
    val array = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )

    val Sym = isSymmetric(array)

    if (Sym)
    {
        println("симметричен")
    }

    else
    {
        println("не симметричен")
    }
}

fun isSymmetric(array: Array<IntArray>): Boolean
{
    val s = array.size
    for (i in 0 until s)
    {
        for (j in 0 until s)
        {
            if (array[i][j] != array[j][i])
            {
                return false
            }
        }
    }
    return true
}