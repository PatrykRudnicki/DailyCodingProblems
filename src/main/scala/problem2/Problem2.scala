package problem2

object Problem2 {

  def calculate(input: Seq[Int]): Seq[Int] = {

    input.zipWithIndex.map { case(_, index) =>
      input.updated(index, 1).reduce(_ * _)
    }
  }

  def calculate2(input: Seq[Int]): Seq[Int] = {
    input.zipWithIndex.map { case(_, index) =>
      val arrayInput = input.toArray

      arrayInput(index) = 1

      arrayInput.reduce(_ * _)
    }
  }

  def calculate3(input: Seq[Int]): Seq[Int] = {
    val arrayInput = input.toArray

    input.zipWithIndex.map { case(elem, index) =>
      arrayInput(index) = 1

      val result = arrayInput.reduce(_ * _)

      arrayInput(index) = elem

      result
    }
  }
}
