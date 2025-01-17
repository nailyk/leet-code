import scala.util.control.Breaks._

object LengthOfLastWord_58 {
  def lengthOfLastWord(s: String): Int = {
    var length = 0
    var i = s.length - 1

    // Skip trailing spaces
    while (i >= 0 && s(i) == ' ') {
      i -= 1
    }

    // Count the length of the last word
    while (i >= 0 && s(i) != ' ') {
      length += 1
      i -= 1
    }

    length
  }
}
