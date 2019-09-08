package problem1

import scala.collection.mutable

object Problem1 {

  def checkSumExists(list: List[Int], value: Int): Boolean = {

    val temp: mutable.HashSet[Int] = mutable.HashSet.empty

    list.exists { elem =>
      val subtractedValue = value - elem

      if (temp.contains(elem)) true
      else {
        temp.add(subtractedValue)
        false
      }
    }
  }
}
