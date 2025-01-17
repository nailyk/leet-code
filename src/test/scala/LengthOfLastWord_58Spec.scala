import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class LengthOfLastWord_58Spec extends AnyFlatSpec {

  behavior of "LengthOfLastWord_58.lengthOfLastWord"

  it should "compute length of last word (test case 1)" in {

    assert(LengthOfLastWord_58.lengthOfLastWord("Hello World") === 5)
  }

  it should "compute length of last word (test case 2)" in {
    assert(
      LengthOfLastWord_58.lengthOfLastWord("   fly me   to   the moon  ") === 4
    )
  }

  it should "compute length of last word (test case 3)" in {
    assert(LengthOfLastWord_58.lengthOfLastWord("luffy is still joyboy") === 6)
  }
}
