import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class RemoveDuplicatesFromSortedArray_26Spec extends AnyFlatSpec {

  behavior of "RemoveDuplicatesFromSortedArray_26.removeDuplicates"

  it should "remove duplicates from array (test case 1)" in {
    val nums = Array(1, 1, 2)
    assert(RemoveDuplicatesFromSortedArray_26.removeDuplicates(nums) === 2)
    assert(nums.startsWith(Array(1, 2)))
  }

  it should "remove duplicates from array (test case 2)" in {
    val nums = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    assert(RemoveDuplicatesFromSortedArray_26.removeDuplicates(nums) === 5)
    assert(nums.startsWith(Array(0, 1, 2, 3, 4)))
  }
}
