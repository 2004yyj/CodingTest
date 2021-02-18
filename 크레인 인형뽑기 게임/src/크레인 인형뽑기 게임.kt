import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val board = arrayListOf(
        arrayListOf(0, 0, 0, 0, 0),
        arrayListOf(0, 0, 1, 0, 3),
        arrayListOf(0, 2, 5, 0, 1),
        arrayListOf(4, 2, 4, 4, 2),
        arrayListOf(3, 5, 1, 3, 1),
    )

    val moves = arrayListOf(1, 5, 3, 5, 1, 2, 1, 4)

    val stack : ArrayList<Int> = ArrayList()
    stack.add(0)

    var result = 0

    for (i in moves.indices) {
        for (j in board.indices) {
            if (board[j][moves[i] - 1] != 0) {
                if (board[j][moves[i] - 1] != stack[stack.lastIndex]) {
                    // if(board[j][moves[i] - 1] != stack.peek())
                    stack.add(board[j][moves[i] - 1])
                    // stack.push(board[j][moves[i] - 1])
                    println("[${moves[i]}, ${j + 1}] ${stack[stack.lastIndex]}")
                } else {
                    stack.removeAt(stack.lastIndex)
                    // stack.pop()
                    result += 2
                }
                board[j][moves[i] - 1] = 0
                break
            }
        }
    }

    println(result)
}