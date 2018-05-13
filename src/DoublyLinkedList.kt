data class DblNode<T>(var value: T) {
    var next: DblNode<T>? = null
    var prev: DblNode<T>? = null
}

class DoublyLinkedList<T> {
    var left: DblNode<T>? = null
    var right: DblNode<T>? = null

    fun leftInsert(info: T) {
        val newNode = DblNode(info)
        newNode.next = left
        left = newNode
        if (right == null) {
            right = newNode
        }
    }

    fun rightInsert(info: T) {
        val newNode = DblNode(info)
        right?.next = newNode
        newNode.prev = right
        right = newNode
        if (left == null) {
            left = newNode
        }
    }

    fun sequentialPrint() {
        var pointer = left
        while (pointer != null) {
            println(pointer.value)
            pointer = pointer.next
        }
    }
}

fun main(args: Array<String>) {
    val infoArray = arrayOf(1, 2, 4, 88, 33, 44, 55, 12312)
    val doublyLinkedList: DoublyLinkedList<Int> = DoublyLinkedList()
    for (elem in infoArray) {
        doublyLinkedList.rightInsert(elem)
    }
    doublyLinkedList.sequentialPrint()
}