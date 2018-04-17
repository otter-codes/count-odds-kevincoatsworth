object CountOdds extends App {

  def oddCounter(num : Int): Int = {

    num match {
      case _ if num % 2 == 0 => num / 2
      case _ => (num - 1) / 2
    }
  }
}
