package problem4

object Problem4 {

  private def calculateSortedInput(sortedInput: Seq[Int]): Int =
    sortedInput match {
      case a :: Nil => a + 1
      case a :: b :: _ if b - a > 1 => a + 1
      case _ :: b :: tail => calculate(b +: tail)
    }

  def calculate(input: Seq[Int]): Int = calculateSortedInput(input.filter(_ > 0).sorted)
}
