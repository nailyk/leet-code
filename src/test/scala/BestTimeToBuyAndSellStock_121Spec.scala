import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class BestTimeToBuyAndSellStock_121Spec extends AnyFlatSpec {

  behavior of "BestTimeToBuyAndSellStock_121.maxProfit"

  it should "compute max profit (test case 1)" in {
    val nums = Array(7,1,5,3,6,4)
    assert(BestTimeToBuyAndSellStock_121.maxProfit(nums) === 5)
  }

    it should "compute max profit (test case 2)" in {
    val nums = Array(7,6,4,3,1)
    assert(BestTimeToBuyAndSellStock_121.maxProfit(nums) === 0)
  }

  it should "compute max profit (test case 3)" in {
    val nums = Array(1,4)
    assert(BestTimeToBuyAndSellStock_121.maxProfit(nums) === 3)
  }
}
