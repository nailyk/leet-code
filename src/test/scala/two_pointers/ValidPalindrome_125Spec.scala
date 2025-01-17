import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class ValidPalindrome_125Spec extends AnyFlatSpec {

  behavior of "ValidPalindrome_125.isPalindrome"

  it should "check if a string is a palindrome (test case 1)" in {
    assert(
      ValidPalindrome_125.isPalindrome(
        "A man, a plan, a canal: Panama"
      ) === true
    )
  }

  it should "check if a string is a palindrome (test case 2)" in {
    assert(ValidPalindrome_125.isPalindrome("race a car") === false)
  }
}
