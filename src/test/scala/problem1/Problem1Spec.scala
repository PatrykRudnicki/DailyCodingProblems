package problem1

import org.scalatest.{MustMatchers, WordSpec}

class Problem1Spec extends WordSpec with MustMatchers {
  import Problem1.checkSumExists

  "checkSumExists method" should {

    "return true" when {

      "input contains two numbers that sum is equal specific number" in {

        val number = 17
        val inputList = List(10, 15, 3, 7)

        checkSumExists(inputList, number) mustBe true

        val anotherNumber = 20
        val anotherList = List(10, 10, 15, 7)

        checkSumExists(anotherList, anotherNumber) mustBe true
      }
    }

    "return false" when {

      "input is empty" in {

        val number = 5
        val inputList = List.empty

        checkSumExists(inputList, number) mustBe false
      }

      "input contains one element" in {

        val number = 5
        val inputList = List(5)

        checkSumExists(inputList, number) mustBe false
      }

      "there is no two numbers that sum is equal requested" in {

        val number = 5
        val inputList = List(5, 7, 9, 12)

        checkSumExists(inputList, number) mustBe false
      }
    }
  }
}
