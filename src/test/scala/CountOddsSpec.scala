import org.scalatest._

class CountOddsSpec extends WordSpec with MustMatchers {

  "Count Odds" must {

    "return 1 when given 2" in {
      CountOdds.oddCounter(2) mustEqual 1
    }

    "return 3 when given 7" in {
      CountOdds.oddCounter(7) mustEqual 3
    }

    "return 4 when given 8" in {
      CountOdds.oddCounter(8) mustEqual 4
    }

  }

}
