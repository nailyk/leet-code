import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class PalindromeNumber_9Spec extends AnyFlatSpec {

  behavior of "PalindromeNumber_9.isPalindrome"

  it should "check if number is a palindrome (test case 1)" in {

    assert(PalindromeNumber_9.isPalindrome(121) === true)
  }

  it should "check if number is a palindrome (test case 2)" in {

    assert(PalindromeNumber_9.isPalindrome(123) === false)
  }

  it should "check if number is a palindrome (test case 3)" in {

    assert(PalindromeNumber_9.isPalindrome(13231) === true)
  }

  it should "check if number is a palindrome (test case 4)" in {

    assert(PalindromeNumber_9.isPalindrome(1410110141) === true)
  }

}
