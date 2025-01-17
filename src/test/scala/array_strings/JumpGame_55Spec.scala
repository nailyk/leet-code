import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class JumpGame_55Spec extends AnyFlatSpec {

  behavior of "JumpGame_55.canJump"

  it should "check if we can jump from begin to end or array (test case 1)" in {
    val nums = Array(2,3,1,1,4)
    assert(JumpGame_55.canJump(nums) === true)
  }

  it should "check if we can jump from begin to end or array (test case 2)" in {
    val nums = Array(3,2,1,0,4)
    assert(JumpGame_55.canJump(nums) === false)
  }
}
