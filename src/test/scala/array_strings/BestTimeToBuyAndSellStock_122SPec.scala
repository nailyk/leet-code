import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class BestTimeToBuyAndSellStock_122Spec extends AnyFlatSpec {

  behavior of "BestTimeToBuyAndSellStock_122.maxProfit"

  it should "compute max profit (test case 1)" in {
    val nums = Array(7,1,5,3,6,4)
    assert(BestTimeToBuyAndSellStock_122.maxProfit(nums) === 7)
  }

    it should "compute max profit (test case 2)" in {
    val nums = Array(1,2,3,4,5)
    assert(BestTimeToBuyAndSellStock_122.maxProfit(nums) === 4)
  }

  it should "compute max profit (test case 3)" in {
    val nums = Array(7,6,4,3,1)
    assert(BestTimeToBuyAndSellStock_122.maxProfit(nums) === 0)
  }
}
