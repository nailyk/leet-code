object BestTimeToBuyAndSellStock_121 {

  def maxProfit(prices: Array[Int]): Int = {

    var buyIndex = 0
    var sellIndex = 1
    var maxProfit = 0

    while (sellIndex < prices.length) {
      if (prices(sellIndex) < prices(buyIndex)) {
        buyIndex = sellIndex
      } else {
        maxProfit = math.max(maxProfit, prices(sellIndex) - prices(buyIndex))
      }
      sellIndex += 1
    }

    maxProfit
  }

}
