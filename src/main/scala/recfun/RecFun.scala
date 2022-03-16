package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (r <= 0 || c >= r || c <= 0) then 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def checkAllClosed(openedCount: Int, chars: List[Char]): Boolean =
      if openedCount < 0 then false
      else if chars.isEmpty then openedCount == 0
      else if chars.head == '(' then checkAllClosed(openedCount + 1, chars.tail)
      else if chars.head == ')' then checkAllClosed(openedCount - 1, chars.tail)
      else checkAllClosed(openedCount, chars.tail)

    checkAllClosed(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money < 0 || coins.isEmpty) 0
    else if (money == 0) 1
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)