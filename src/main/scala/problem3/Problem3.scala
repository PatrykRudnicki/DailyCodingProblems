package problem3

object Problem3 {

  case class Node(value: String, left: Option[Node], right: Option[Node])

  object Node {
    val empty: Node = Node("", None, None)
  }

  def serialise(node: Node): String = {

    val left = node.left.map(serialise(_)).getOrElse("X")
    val right = node.right.map(serialise(_)).getOrElse("X")

    node.value + "," + left + "," + right
  }

  def deserialiseNode(node: Iterator[String]): Option[Node] = {
    val v = node.next()

    if (v == "X") None
    else {
      val left = deserialiseNode(node)
      val right = deserialiseNode(node)

      Some(Node(v, left, right))
    }
  }

  def deserialise(node: String): Node = deserialiseNode(node.split(",").iterator).getOrElse(Node.empty)
}
