import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class IsSubsequence_392Spec extends AnyFlatSpec {

  behavior of "IsSubsequence_392.isSubsequence"

  it should "check subsequence (test case 1)" in {
    assert(
      IsSubsequence_392.isSubsequence("abc", "ahbgdc") === true
    )
  }

  it should "check subsequence (test case 2)" in {
    assert(
      IsSubsequence_392.isSubsequence("axc", "ahbgdc") === false
    )
  }
}
