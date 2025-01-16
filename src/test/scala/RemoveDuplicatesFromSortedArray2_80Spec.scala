import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class RemoveDuplicatesFromSortedArray2_80Spec extends AnyFlatSpec {

  behavior of "RemoveDuplicatesFromSortedArray2_80.removeDuplicates"

  it should "remove duplicates from array (test case 1)" in {
    val nums = Array(1,1,1,2,2,3)
    assert(RemoveDuplicatesFromSortedArray2_80.removeDuplicates(nums) === 5)
    assert(nums.startsWith(Array(1,1,2,2,3)))
  }

  it should "remove duplicates from array (test case 2)" in {
    val nums = Array(0,0,1,1,1,1,2,3,3)
    assert(RemoveDuplicatesFromSortedArray2_80.removeDuplicates(nums) === 7)
    assert(nums.startsWith(Array(0,0,1,1,2,3,3)))
  }
}
