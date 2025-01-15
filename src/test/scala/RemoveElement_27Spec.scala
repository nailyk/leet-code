import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class RemoveElement_27Spec extends AnyFlatSpec {

  behavior of "RemoveElement_27.remove"

  it should "remove element from array (test case 1)" in {
    val nums = Array(3, 2, 2, 3)
    assert(RemoveElement_27.removeElement(nums, 3) === 2)
    assert(nums.startsWith(Array(2, 2)))
  }

    it should "remove element from array (test case 2)" in {
    val nums = Array(0,1,2,2,3,0,4,2)
    assert(RemoveElement_27.removeElement(nums, 2) === 5)
    assert(nums.startsWith(Array(0,1,4,0,3)))
  }
}
