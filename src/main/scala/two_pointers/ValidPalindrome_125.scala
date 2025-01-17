object ValidPalindrome_125 {
  def isPalindrome(s: String): Boolean = {

    var leftIndex = 0
    var rightIndex = s.length - 1
    while (leftIndex < rightIndex) {

      while (leftIndex < rightIndex && !s(leftIndex).isLetterOrDigit) {
        leftIndex += 1
      }
      while (leftIndex < rightIndex && !s(rightIndex).isLetterOrDigit) {
        rightIndex -= 1
      }

      if (s(leftIndex).toLower != s(rightIndex).toLower) {
        return false

      }
      leftIndex += 1
      rightIndex -= 1

    }

    true
  }
}
