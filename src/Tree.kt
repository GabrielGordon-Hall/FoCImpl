data class Node<out T, Node>(private val value: T) {
    val info: T? = value
    var left: Node? = null
    var right: Node? = null
}

class BinaryTree(var root: Node = null) {

    fun preorderTraverse(node: Node?) {
        if (node.info == null) {
            return
        }
        println(node.info)
        preorderTraverse(node.left)
        preorderTraverse(node.right)
    }

    fun inorderTraverse(node: Node?) {
        if (node.info == null) {
            return
        }
        inorderTraverse(node.left)
        println(node.info)
        inorderTraverse(node.right)
    }

    fun postorderTraverse(node: Node?) {
        if (node.info == null) {
            return
        }
        postorderTraverse(node.left)
        postorderTraverse(node.right)
        println(node.info)
    }
}

fun <T> constructBinaryTree(args: Array<T>) {

}

fun main(args: Array<String>) {
    val tree = BinaryTree()
    tree.root = Node(1)
    tree.root!!.left = Node(10)
    tree.root!!.right = Node(18)
    tree.root!!.left!!.left = Node(25)

    println("Printing in preorder!")
    tree.preorderTraverse(tree.root)
    println("Printing in inorder!")
    tree.inorderTraverse(tree.root)
    println("Printing in postorder!")
    tree.postorderTraverse(tree.root)
}

