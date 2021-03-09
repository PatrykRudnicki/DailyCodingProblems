package problem2

import org.scalatest.{MustMatchers, WordSpec}

class Problem2Spec extends WordSpec with MustMatchers {
  import Problem2.{calculate, calculate2, calculate3}

  "calculate method" should {

    "return list [120, 60, 40, 30, 24]" when {

      "input is [1, 2, 3, 4, 5]" in {

        val input = Seq(1, 2, 3, 4, 5)
        val expectedResult = Seq(120, 60, 40, 30, 24)

        calculate(input) mustBe expectedResult
        calculate2(input) mustBe expectedResult
        calculate3(input) mustBe expectedResult
      }
    }

    "return list [2, 3, 6]" when {

      "input is [3, 2, 1]" in {

        val input = Seq(3, 2, 1)
        val expectedResult = Seq(2, 3, 6)

        calculate(input) mustBe expectedResult
        calculate2(input) mustBe expectedResult
        calculate3(input) mustBe expectedResult
      }
    }

    "return list [32, 16, 32, 16]" when {

      "input is [2, 4, 2, 4]" in {

        val input = Seq(2, 4, 2, 4)
        val expectedResult = Seq(32, 16, 32, 16)

        calculate(input) mustBe expectedResult
        calculate2(input) mustBe expectedResult
        calculate3(input) mustBe expectedResult
      }
    }

    "return list" when {

      "input is [2, 4, 4, 2, 4] - duplicated value close to each other" in {

        val input = Seq(2, 4, 4, 2, 4)
        val expectedResult = Seq(128, 64, 64, 128, 64)

        calculate(input) mustBe expectedResult
        calculate2(input) mustBe expectedResult
        calculate3(input) mustBe expectedResult
      }
    }
  }
}
