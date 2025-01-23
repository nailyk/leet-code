import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class PlusOne_66Spec extends AnyFlatSpec {

  behavior of "PlusOne_66.plusOne"

  it should "check if number is a palindrome (test case 1)" in {

    assert(PalindromeNumber_9.isPalindrome(121) === true)
  }

  it should "check if number is a palindrome (test case 2)" in {

    assert(PalindromeNumber_9.isPalindrome(123) === false)
  }

}
