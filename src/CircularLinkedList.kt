private class CircularLinkedList<T> {
    var ptr: Node<T>? = null

    fun leftInsert(info: T) {
        val newNode = Node(info)
        if (ptr == null) { ptr = newNode }
        else {
            newNode.next = ptr?.next
            ptr?.next = newNode
        }
    }
}
