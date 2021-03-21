package problem3

import org.scalatest.{MustMatchers, WordSpec}

class Problem3Spec extends WordSpec with MustMatchers {
  import problem3.Problem3._

  "Node" should {

    "be the same after serialise and deserialise method" in {

      val nodeWithoutChildren = Node("1", None, None)
      val nodeWithTwoChildren =
        Node("1", Some(Node("2", Some(Node("4", None, None)), None)), Some(Node("3", None, None)))
      val taskNode =
        Node("root", Some(Node("left", Some(Node("left.left", None, None)), None)), Some(Node("right", None, None)))

      deserialise(serialise(nodeWithoutChildren)) mustBe nodeWithoutChildren
      deserialise(serialise(nodeWithTwoChildren)) mustBe nodeWithTwoChildren
      deserialise(serialise(taskNode)) mustBe taskNode
    }

    "calculate task exercise" in {

      val taskNode =
        Node("root", Some(Node("left", Some(Node("left.left", None, None)), None)), Some(Node("right", None, None)))

      deserialise(serialise(taskNode)).left.flatMap(_.left.map(_.value)).get == "left.left"
    }
  }
}
