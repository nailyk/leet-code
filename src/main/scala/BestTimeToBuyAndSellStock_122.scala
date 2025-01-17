object BestTimeToBuyAndSellStock_122 {

  def maxProfit(prices: Array[Int]): Int = {
    var maxProfit = 0
    for (i <- 1 until prices.length) {
      if (prices(i) > prices(i - 1)) {
        maxProfit += prices(i) - prices(i - 1)
      }
    }

    maxProfit
  }
}
