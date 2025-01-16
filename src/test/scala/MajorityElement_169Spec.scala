import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class MajorityElement_169Spec extends AnyFlatSpec {

  behavior of "MajorityElement_169.majorityElement"

  it should "find majority element from array (test case 1)" in {
    val nums = Array(3,2,3)
    assert(MajorityElement_169.majorityElement(nums) === 3)
  }

  it should "find majority element from array (test case 2)" in {
    val nums = Array(2,2,1,1,1,2,2)
    assert(MajorityElement_169.majorityElement(nums) === 2)
  }

    it should "find majority element from array (test case 3)" in {
    val nums = Array(10,9,9,9,10)
    assert(MajorityElement_169.majorityElement(nums) === 9)
  }
}
