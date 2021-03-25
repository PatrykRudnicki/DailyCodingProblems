package problem4

import org.scalatest.{MustMatchers, WordSpec}

class Problem4Spec extends WordSpec with MustMatchers {
  import problem4.Problem4.calculate

  "calculate method" should {

    "find the first missing positive integer in list" in {

      val input1 = Seq(3, 4, -1, 1)
      val input2 = Seq(1, 2, 0)

      val expectedResult1 = 2
      val expectedResult2 = 3

      calculate(input1) mustBe expectedResult1
      calculate(input2) mustBe expectedResult2
    }
  }
}
