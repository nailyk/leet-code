import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class RotateArray_89Spec extends AnyFlatSpec {

  behavior of "RotateArray_89.rotate"

  it should "rotate array by k steps (test case 1)" in {
    val nums = Array(1,2,3,4,5,6,7)
    RotateArray_89.rotate(nums, 3)
    assert(nums === Array(5,6,7,1,2,3,4))
  }

  it should "rotate array by k steps (test case 2)" in {
    val nums = Array(-1,-100,3,99)
    RotateArray_89.rotate(nums, 2)
    assert(nums === Array(3, 99, -1, -100))
  }
}
