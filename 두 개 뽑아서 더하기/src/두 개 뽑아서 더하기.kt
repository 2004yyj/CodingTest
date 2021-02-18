fun main() {
    val numbers = arrayOf(2, 1, 3, 4, 1)

    val answer: ArrayList<Int> = ArrayList()

    for(i in numbers.indices) {
        for (j in i+1 until numbers.size) {
            if (!answer.contains(numbers[i] + numbers[j])) {
                answer.add(numbers[i] + numbers[j])
            }
        }
    }
    answer.sort()

    println(answer)
}